package com.example.bestelapp.fragments.title

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bestelapp.R
import com.example.bestelapp.data.qr.QrDatabase
import com.example.bestelapp.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Value init
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
        val application = requireNotNull(this.activity).application
        val qrDataSource = QrDatabase.getInstance(application).qrDatabaseDao
        val viewModelFactory = TitleViewModelFactory(qrDataSource, application)
        val titleViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(TitleViewModel::class.java)

        // Databinding
        binding.titleViewModel = titleViewModel
        binding.lifecycleOwner = this

        // Title
        activity?.title = titleViewModel.getTitle()

        // Observers
        titleViewModel.navigateToOrderlist.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToOrderlistFragment(
                    titleViewModel.qrInDatabase.value?.tableNumber!!, titleViewModel.qrInDatabase.value?.controlNumber!!))
                titleViewModel.doneNavigating()
            }
        })
        titleViewModel.navigateToQr.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToQrFragment())
                titleViewModel.doneNavigating()
            }
        })
        titleViewModel.navigateToSponsor.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToSponsorFragment())
                titleViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}