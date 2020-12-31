package com.example.bestelapp.fragments.qr

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bestelapp.data.qr.QrDatabaseDao

/**
 * The Factory class for the [QrViewModel]
 *
 * @author Cedric Delaruelle
 * @see [QrFragment]
 */
class QrViewModelFactory(
    private val dataSource: QrDatabaseDao,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QrViewModel::class.java)) {
            return QrViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
