package com.example.bestelapp.fragments.orderlist

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
import com.example.bestelapp.data.product.ProductDatabase
import com.example.bestelapp.databinding.FragmentOrderlistBinding
import com.example.bestelapp.databinding.FragmentTitleBinding
import timber.log.Timber

class OrderlistFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Value init
        val binding: FragmentOrderlistBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_orderlist, container, false)
        val application = requireNotNull(this.activity).application
        val dataSource = ProductDatabase.getInstance(application).productDatabaseDao
        val viewModelFactory = OrderlistViewModelFactory(dataSource, application)
        val orderlistViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(OrderlistViewModel::class.java)
        val adapter = ProductAdapter()

        // Databinding
        binding.orderListViewModel = orderlistViewModel
        binding.lifecycleOwner = this
        binding.rvOrderlistShoworders.adapter = adapter

        // Observers
        orderlistViewModel.products.observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.submitList(it)
            }
        })

        orderlistViewModel.navigateToConfirmation.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(OrderlistFragmentDirections.actionOrderlistFragmentToConfirmationFragment())
                orderlistViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}