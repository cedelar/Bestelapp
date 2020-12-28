package com.example.bestelapp.fragments.confirmation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ConfirmationViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ConfirmationViewModel::class.java)) {
            return ConfirmationViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}