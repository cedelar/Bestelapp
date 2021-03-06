package com.example.bestelapp.fragments.sponsor

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * The Factory class for the [SponsorViewModel]
 *
 * @author Cedric Delaruelle
 * @see [SponsorFragment]
 */
class SponsorViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SponsorViewModel::class.java)) {
            return SponsorViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
