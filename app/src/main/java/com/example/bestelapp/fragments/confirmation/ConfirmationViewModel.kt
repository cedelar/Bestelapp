package com.example.bestelapp.fragments.confirmation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ConfirmationViewModel(application: Application): AndroidViewModel(application)   {
    private var _navigateToSucces = MutableLiveData<Boolean>()

    val navigateToSucces: LiveData<Boolean>
        get() = _navigateToSucces

    fun onNextClicked(){
        _navigateToSucces.value = true
    }

    fun doneNavigating(){
        _navigateToSucces.value = false
    }
}