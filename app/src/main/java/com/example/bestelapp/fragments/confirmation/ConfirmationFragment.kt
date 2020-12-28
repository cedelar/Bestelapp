package com.example.bestelapp.fragments.confirmation

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
import com.example.bestelapp.databinding.FragmentConfirmationBinding
import com.example.bestelapp.databinding.FragmentOrdersuccesBinding
import com.example.bestelapp.databinding.FragmentTitleBinding
import com.example.bestelapp.fragments.ordersucces.OrderSuccesViewModel
import com.example.bestelapp.fragments.ordersucces.OrderSuccesViewModelFactory
import com.example.bestelapp.fragments.qr.QrFragmentDirections

class ConfirmationFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Value init
        val binding = DataBindingUtil.inflate<FragmentConfirmationBinding>(inflater, R.layout.fragment_confirmation, container, false)
        val application = requireNotNull(this.activity).application
        val viewModelFactory = ConfirmationViewModelFactory(application)
        val confirmationViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(ConfirmationViewModel::class.java)


        // Binding
        binding.confirmationViewModel = confirmationViewModel
        binding.lifecycleOwner = this

        //Observer
        confirmationViewModel.navigateToSucces.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(ConfirmationFragmentDirections.actionConfirmationFragmentToOrdersuccesFragment())
                confirmationViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}