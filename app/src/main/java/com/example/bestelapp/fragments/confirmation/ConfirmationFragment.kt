package com.example.bestelapp.fragments.confirmation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bestelapp.R
import com.example.bestelapp.databinding.FragmentConfirmationBinding

/**
 * The [Fragment] class for the [ConfirmationFragment]
 *
 * @author Cedric Delaruelle
 * @see [ConfirmationViewModel]
 */
class ConfirmationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Value init
        val binding = DataBindingUtil.inflate<FragmentConfirmationBinding>(
            inflater,
            R.layout.fragment_confirmation,
            container,
            false
        )
        val application = requireNotNull(this.activity).application
        val arguments = arguments?.let { ConfirmationFragmentArgs.fromBundle(it) }
        val viewModelFactory = arguments?.let {
            ConfirmationViewModelFactory(
                it.orders,
                it.table,
                it.control,
                application
            )
        }
        val confirmationViewModel =
            viewModelFactory?.let {
                ViewModelProvider(
                    this,
                    it
                ).get(ConfirmationViewModel::class.java)
            }

        // Binding
        binding.confirmationViewModel = confirmationViewModel
        binding.lifecycleOwner = this

        // Title
        activity?.title = confirmationViewModel?.getTitle()

        // Observer
        confirmationViewModel?.navigateToSuccesMessage?.observe(
            viewLifecycleOwner,
            {
                if (it != "") {
                    this.findNavController().navigate(
                        ConfirmationFragmentDirections.actionConfirmationFragmentToOrdersuccesFragment(
                            it
                        )
                    )
                    confirmationViewModel.doneNavigating()
                }
            }
        )

        return binding.root
    }
}
