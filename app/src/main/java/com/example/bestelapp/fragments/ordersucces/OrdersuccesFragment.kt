package com.example.bestelapp.fragments.ordersucces

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bestelapp.R
import com.example.bestelapp.databinding.FragmentOrdersuccesBinding

/**
 * The [Fragment] class for the [OrdersuccesFragment]
 *
 * @author Cedric Delaruelle
 * @see [OrdersuccesViewModel]
 */
class OrdersuccesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Value init
        val binding = DataBindingUtil.inflate<FragmentOrdersuccesBinding>(
            inflater,
            R.layout.fragment_ordersucces,
            container,
            false
        )
        val application = requireNotNull(this.activity).application
        val arguments = arguments?.let { OrdersuccesFragmentArgs.fromBundle(it) }
        val viewModelFactory =
            arguments?.let { OrdersuccesViewModelFactory(it.message, application) }
        val orderSuccesViewModel =
            viewModelFactory?.let {
                ViewModelProvider(
                    this,
                    it
                ).get(OrdersuccesViewModel::class.java)
            }

        // Binding
        binding.orderSuccesViewModel = orderSuccesViewModel
        binding.lifecycleOwner = this

        // Title
        activity?.title = orderSuccesViewModel?.getTitle()

        // Observer
        orderSuccesViewModel?.navigateToTitle?.observe(
            viewLifecycleOwner,
            {
                if (it == true) {
                    this.findNavController()
                        .navigate(OrdersuccesFragmentDirections.actionOrdersuccesFragmentToTitleFragment())
                    orderSuccesViewModel.doneNavigating()
                }
            }
        )

        return binding.root
    }
}
