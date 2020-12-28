package com.example.bestelapp.fragments.qr

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class QrViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QrViewModel::class.java)) {
            return QrViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}