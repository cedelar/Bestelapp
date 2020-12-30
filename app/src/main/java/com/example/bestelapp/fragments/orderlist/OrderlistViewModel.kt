package com.example.bestelapp.fragments.orderlist

import android.app.Application
import androidx.lifecycle.*
import com.example.bestelapp.data.datawrapper.Order
import com.example.bestelapp.data.product.ProductDatabase
import com.example.bestelapp.data.product.decrementByName
import com.example.bestelapp.data.product.incrementByName
import com.example.bestelapp.data.product.isAmountPlaced
import com.example.bestelapp.data.qr.QrDatabaseDao
import com.example.bestelapp.repository.ProductRepository
import kotlinx.coroutines.launch
import timber.log.Timber

class OrderlistViewModel(val qrDataSource: QrDatabaseDao, val table: Int, application: Application): AndroidViewModel(application) {

    // Value Init
    private val database = ProductDatabase.getInstance(application)
    private val productRepository = ProductRepository(database)
    val products = productRepository.products

    private var _viewUpdateRequired = MutableLiveData<Boolean>()
    val viewUpdateRequired: LiveData<Boolean>
        get() = _viewUpdateRequired

    private var _confirmButtonVisible = MutableLiveData<Boolean>()
    val confirmButtonVisible: LiveData<Boolean>
        get() = _confirmButtonVisible

    private var _navigateToConfirmation = MutableLiveData<Boolean>()
    val navigateToConfirmation: LiveData<Boolean>
        get() = _navigateToConfirmation


    init{
        viewModelScope.launch {
            productRepository.refreshProducts()
        }
    }

    // Buttonhandlers
    fun onAddClicked(productName: String){
        products.value?.incrementByName(productName)
        _viewUpdateRequired.value = true
        updateConfirmButton()

        Timber.i("Add: " + productName)
        Timber.i("" + products.value)
    }

    fun onSubtractClicked(productName: String){
        products.value?.decrementByName(productName)
        _viewUpdateRequired.value = true
        updateConfirmButton()
        Timber.i("Subtract: " + productName)
        Timber.i("" + products.value)
    }

    fun onConfirmClicked(){
        //TODO: Inputvalidation
        _navigateToConfirmation.value = true
    }


    // Livedataupdaters
    private fun updateConfirmButton(){
        _confirmButtonVisible.value = products.value?.isAmountPlaced() == true
    }

    fun viewUpdateExecuted(){
        _viewUpdateRequired.value = false
    }

    fun doneNavigating(){
        _navigateToConfirmation.value = false
    }

    // Datapassing
    fun getOrders(): Array<Order> {
        val list =  ArrayList<Order>()
        for(product in products.value!!){
            if(product.amount > 0){
                list.add(Order(product.name, product.amount, product.price))
            }
        }
        return list.toTypedArray()
    }

    fun getTitle(): String{
        return "Plaats uw bestelling: Tafel $table"
    }
}