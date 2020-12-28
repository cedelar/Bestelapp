package com.example.bestelapp.fragments.sponsor

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
import com.example.bestelapp.databinding.FragmentQrBinding
import com.example.bestelapp.databinding.FragmentSponsorBinding
import com.example.bestelapp.databinding.FragmentTitleBinding
import com.example.bestelapp.fragments.title.TitleFragmentDirections
import com.example.bestelapp.fragments.title.TitleViewModel
import com.example.bestelapp.fragments.title.TitleViewModelFactory

class SponsorFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Value init
        val binding = DataBindingUtil.inflate<FragmentSponsorBinding>(inflater, R.layout.fragment_sponsor, container, false)
        val application = requireNotNull(this.activity).application
        val viewModelFactory = SponsorViewModelFactory(application)
        val sponsorViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(SponsorViewModel::class.java)


        // Binding
        binding.sponsorViewModel = sponsorViewModel
        binding.lifecycleOwner = this

        //Observer
        sponsorViewModel.navigateToTitle.observe(viewLifecycleOwner, Observer {
            if(it == true){
                this.findNavController().navigate(SponsorFragmentDirections.actionSponsorFragmentToTitleFragment())
                sponsorViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}