package com.example.bestelapp.fragments.qr

import android.Manifest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bestelapp.R
import com.example.bestelapp.data.qr.QrDatabase
import com.example.bestelapp.databinding.FragmentQrBinding
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import me.dm7.barcodescanner.zxing.ZXingScannerView

class QrFragment: Fragment() {

    private lateinit var qrScanner: ZXingScannerView
    private var permissionGranted = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Dexter.withActivity(this.activity)
            .withPermission(Manifest.permission.CAMERA)
            .withListener(object: PermissionListener {
                override fun onPermissionGranted(response: PermissionGrantedResponse?) {
                    permissionGranted = true
                }

                override fun onPermissionDenied(response: PermissionDeniedResponse?) {
                    Toast.makeText(activity,
                        "You should enable camera to make use of the QR-scanner",
                        Toast.LENGTH_LONG)
                        .show()
                }

                override fun onPermissionRationaleShouldBeShown(
                    permission: PermissionRequest?,
                    token: PermissionToken?
                ) {
                    token?.continuePermissionRequest()
                }

            }).check()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Value init
        val binding = DataBindingUtil.inflate<FragmentQrBinding>(inflater, R.layout.fragment_qr, container, false)
        val application = requireNotNull(this.activity).application
        val dataSource = QrDatabase.getInstance(application).qrDatabaseDao
        val viewModelFactory = QrViewModelFactory(dataSource, application)
        val qrViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(QrViewModel::class.java)

        qrScanner = binding.qrQr
        qrScanner.setResultHandler { qrViewModel.handleQrScannerResult(it) }
        qrScanner.setAspectTolerance(0.5f)

        // Binding
        binding.qrViewModel = qrViewModel
        binding.lifecycleOwner = this

        //Observers
        qrViewModel.navigateToTitle.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(QrFragmentDirections.actionQrFragmentToTitleFragment())
                qrViewModel.doneNavigating()
            }
        })

        qrViewModel.errorMessage.observe(viewLifecycleOwner, Observer {
            Toast.makeText(activity, it, Toast.LENGTH_LONG).show()
        })

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        if(permissionGranted){
            qrScanner.startCamera()
        }
    }

    override fun onPause() {
        super.onPause()
        if(permissionGranted){
            qrScanner.stopCamera()
        }
    }

}