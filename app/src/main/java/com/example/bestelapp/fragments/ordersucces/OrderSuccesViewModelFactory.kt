package com.example.bestelapp.fragments.ordersucces

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * The Factory class for the [OrderSuccesViewModel]
 *
 * @author Cedric Delaruelle
 * @see [OrderSuccesFragment]
 */
class OrderSuccesViewModelFactory(
    private val message: String,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(OrderSuccesViewModel::class.java)) {
            return OrderSuccesViewModel(message, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
