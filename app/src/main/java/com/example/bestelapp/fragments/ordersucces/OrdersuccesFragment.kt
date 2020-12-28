package com.example.bestelapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bestelapp.R
import com.example.bestelapp.databinding.FragmentOrdersuccesBinding
import com.example.bestelapp.databinding.FragmentTitleBinding

class OrdersuccesFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentOrdersuccesBinding>(inflater, R.layout.fragment_ordersucces, container, false)

        //The complete onClickListener with Navigation
        binding.btnOrdersuccesBackbtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_ordersuccesFragment_to_titleFragment))

        return binding.root
    }
}