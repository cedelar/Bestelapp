package com.example.bestelapp.fragments.confirmation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bestelapp.R
import com.example.bestelapp.databinding.FragmentConfirmationBinding
import com.example.bestelapp.databinding.FragmentTitleBinding

class ConfirmationFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentConfirmationBinding>(inflater, R.layout.fragment_confirmation, container, false)

        //The complete onClickListener with Navigation
        binding.btnConfirmationConfirm.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_confirmationFragment_to_ordersuccesFragment))

        return binding.root
    }
}