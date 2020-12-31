package com.example.bestelapp.fragments.ordersucces

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * The Factory class for the [OrdersuccesViewModel]
 *
 * @author Cedric Delaruelle
 * @see [OrdersuccesFragment]
 */
class OrdersuccesViewModelFactory(
    private val message: String,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(OrdersuccesViewModel::class.java)) {
            return OrdersuccesViewModel(message, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
