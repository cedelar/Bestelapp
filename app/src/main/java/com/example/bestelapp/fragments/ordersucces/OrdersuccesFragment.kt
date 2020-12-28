package com.example.bestelapp.fragments.ordersucces

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
import com.example.bestelapp.databinding.FragmentTitleBinding
import com.example.bestelapp.fragments.qr.QrFragmentDirections
import com.example.bestelapp.fragments.qr.QrViewModel
import com.example.bestelapp.fragments.qr.QrViewModelFactory

class OrdersuccesFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Value init
        val binding = DataBindingUtil.inflate<FragmentOrdersuccesBinding>(inflater, R.layout.fragment_ordersucces, container, false)
        val application = requireNotNull(this.activity).application
        val viewModelFactory = OrderSuccesViewModelFactory(application)
        val orderSuccesViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(OrderSuccesViewModel::class.java)


        // Binding
        binding.orderSuccesViewModel = orderSuccesViewModel
        binding.lifecycleOwner = this

        //Observer
        orderSuccesViewModel.navigateToTitle.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(OrdersuccesFragmentDirections.actionOrdersuccesFragmentToTitleFragment())
                orderSuccesViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}