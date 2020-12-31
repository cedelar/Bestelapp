package com.example.bestelapp.fragments.confirmation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bestelapp.data.datawrapper.Order

/**
 * The Factory class for the [ConfirmationViewModel]
 *
 * @author Cedric Delaruelle
 * @see [ConfirmationFragment]
 */
class ConfirmationViewModelFactory(
    private val orders: Array<Order>,
    private val table: Int,
    private val control: Int,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ConfirmationViewModel::class.java)) {
            return ConfirmationViewModel(orders, table, control, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
