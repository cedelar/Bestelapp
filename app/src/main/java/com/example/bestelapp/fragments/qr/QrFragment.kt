package com.example.bestelapp.fragments.qr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.bestelapp.R
import com.example.bestelapp.databinding.FragmentOrdersuccesBinding
import com.example.bestelapp.databinding.FragmentQrBinding
import com.example.bestelapp.databinding.FragmentSponsorBinding
import com.example.bestelapp.fragments.sponsor.SponsorFragmentDirections
import com.example.bestelapp.fragments.sponsor.SponsorViewModel
import com.example.bestelapp.fragments.sponsor.SponsorViewModelFactory

class QrFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Value init
        val binding = DataBindingUtil.inflate<FragmentQrBinding>(inflater, R.layout.fragment_qr, container, false)
        val application = requireNotNull(this.activity).application
        val viewModelFactory = QrViewModelFactory(application)
        val qrViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(QrViewModel::class.java)


        // Binding
        binding.qrViewModel = qrViewModel
        binding.lifecycleOwner = this

        //Observer
        qrViewModel.navigateToTitle.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(QrFragmentDirections.actionQrFragmentToTitleFragment())
                qrViewModel.doneNavigating()
            }
        })

        return binding.root
    }

}