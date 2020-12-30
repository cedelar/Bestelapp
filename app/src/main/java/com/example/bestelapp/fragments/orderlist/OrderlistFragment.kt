package com.example.bestelapp.fragments.orderlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bestelapp.R
import com.example.bestelapp.databinding.FragmentOrderlistBinding
import timber.log.Timber

class OrderlistFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Value init
        val binding: FragmentOrderlistBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_orderlist, container, false)
        val application = requireNotNull(this.activity).application
        val arguments = arguments?.let { OrderlistFragmentArgs.fromBundle(it) }
        val viewModelFactory = arguments?.let {
            OrderlistViewModelFactory(
                it.table,
                application
            )
        }
        val orderlistViewModel =
            viewModelFactory?.let {
                ViewModelProvider(
                    this,
                    it
                ).get(OrderlistViewModel::class.java)
            }
        val adapter = ProductAdapter(
            ProductItemListener(
                { name -> orderlistViewModel?.onAddClicked(name) },
                { name -> orderlistViewModel?.onSubtractClicked(name) }
            )
        )

        // Databinding
        binding.orderListViewModel = orderlistViewModel
        binding.lifecycleOwner = this
        binding.rvOrderlistShoworders.adapter = adapter

        // Title
        activity?.title = orderlistViewModel?.getTitle()

        // Observers
        orderlistViewModel?.products?.observe(
            viewLifecycleOwner,
            {
                it?.let {
                    Timber.i("Products Updated")
                    adapter.submitList(it)
                    adapter.notifyDataSetChanged()
                }
            }
        )

        orderlistViewModel?.viewUpdateRequired?.observe(
            viewLifecycleOwner,
            {
                if (it == true) {
                    adapter.notifyDataSetChanged()
                    orderlistViewModel.viewUpdateExecuted()
                }
            }
        )

        orderlistViewModel?.navigateToConfirmation?.observe(
            viewLifecycleOwner,
            {
                if (it == true) {
                    this.findNavController().navigate(
                        OrderlistFragmentDirections.actionOrderlistFragmentToConfirmationFragment(
                            orderlistViewModel.getOrders(),
                            arguments.table,
                            arguments.control
                        )
                    )
                    orderlistViewModel.doneNavigating()
                }
            }
        )

        return binding.root
    }
}
