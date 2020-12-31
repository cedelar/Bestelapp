package com.example.bestelapp.fragments.title

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bestelapp.data.qr.QrDatabaseDao

/**
 * The Factory class for the [TitleViewModel]
 *
 * @author Cedric Delaruelle
 * @see [TitleFragment]
 */
class TitleViewModelFactory(
    private val dataSource: QrDatabaseDao,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TitleViewModel::class.java)) {
            return TitleViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
