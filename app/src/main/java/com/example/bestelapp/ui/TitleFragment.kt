package com.example.bestelapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.bestelapp.R
import com.example.bestelapp.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)

        //The complete onClickListener with Navigation
        binding.btnTitleOrder.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_orderlistFragment))

        return binding.root
    }
}