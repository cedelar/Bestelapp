package com.example.bestelapp.fragments.confirmation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bestelapp.data.datawrapper.Order
import com.example.bestelapp.data.qr.QrDatabaseDao

class ConfirmationViewModelFactory(
    private val qrDataSource: QrDatabaseDao,
    private val orders: Array<Order>,
    private val table: Int,
    private val control: Int,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ConfirmationViewModel::class.java)) {
            return ConfirmationViewModel(qrDataSource, orders, table, control, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}