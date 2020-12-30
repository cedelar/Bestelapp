package com.example.bestelapp.fragments.orderlist

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.Suppress

class OrderlistViewModelFactory(
    private val table: Int,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(OrderlistViewModel::class.java)) {
            return OrderlistViewModel(table, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
