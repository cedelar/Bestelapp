package com.example.bestelapp.fragments.orderlist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.bestelapp.data.product.ProductDataProvider
import com.example.bestelapp.data.product.ProductDatabaseDao
import timber.log.Timber

class OrderlistViewModel(
    val database: ProductDatabaseDao,
    application: Application): AndroidViewModel(application) {

    //LiveData<List> with all products
    //val products = database.getAllProducts()
    val products = ProductDataProvider.getTestProducts()

    //TODO
    val confirmButtonVisible = true

    init {

    }

    // Navigation
    private var _navigateToConfirmation = MutableLiveData<Boolean>()

    val navigateToConfirmation: LiveData<Boolean>
        get() = _navigateToConfirmation

    fun onConfirmClicked(){
        //TODO: Inputvalidation
        _navigateToConfirmation.value = true
    }

    fun doneNavigating(){
        _navigateToConfirmation.value = false
    }

}