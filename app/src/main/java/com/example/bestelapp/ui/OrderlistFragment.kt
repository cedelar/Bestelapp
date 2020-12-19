package com.example.bestelapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bestelapp.R
import com.example.bestelapp.databinding.FragmentOrderlistBinding
import com.example.bestelapp.databinding.FragmentTitleBinding

class OrderlistFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentOrderlistBinding>(inflater, R.layout.fragment_orderlist, container, false)

        //The complete onClickListener with Navigation
        binding.btnOrderlistOrder.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_orderlistFragment_to_confirmationFragment))

        return binding.root
    }
}