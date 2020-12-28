package com.example.bestelapp.fragments.ordersucces

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class OrderSuccesViewModel(application: Application): AndroidViewModel(application)  {
    private var _navigateToTitle = MutableLiveData<Boolean>()

    val navigateToTitle: LiveData<Boolean>
        get() = _navigateToTitle

    fun onBackClicked(){
        _navigateToTitle.value = true
    }

    fun doneNavigating(){
        _navigateToTitle.value = false
    }
}