package com.example.bestelapp.fragments.orderlist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.bestelapp.data.datawrapper.Order
import com.example.bestelapp.data.product.ModelProduct
import com.example.bestelapp.data.product.ProductDatabase
import com.example.bestelapp.data.product.decrementByName
import com.example.bestelapp.data.product.incrementByName
import com.example.bestelapp.data.product.isAmountPlaced
import com.example.bestelapp.repository.ProductRepository
import kotlinx.coroutines.launch

/**
 * The [AndroidViewModel] class for the [OrderlistFragment]
 *
 * @property table The number of the table to be placing the order
 * @author Cedric Delaruelle
 */
class OrderlistViewModel(val table: Int, application: Application) : AndroidViewModel(application) {

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

    init {
        viewModelScope.launch {
            productRepository.refreshProducts()
        }
    }

    // Buttonhandlers
    /**
     * Function to be called when the 'Add' button is clicked.
     *
     * Increases the amount of the required [ModelProduct] by 1
     *
     * @param productName The name of the required [ModelProduct]
     */
    fun onAddClicked(productName: String) {
        products.value?.incrementByName(productName)
        _viewUpdateRequired.value = true
        updateConfirmButton()
    }

    /**
     * Function to be called when the 'Subtract' button is clicked.
     *
     * Decreases the amount of the required [ModelProduct] by 1
     *
     * @param productName The name of the required [ModelProduct]
     */
    fun onSubtractClicked(productName: String) {
        products.value?.decrementByName(productName)
        _viewUpdateRequired.value = true
        updateConfirmButton()
    }

    /**
     * Function to be called when the 'Confirm' button is clicked.
     *
     * Triggers navigation
     */
    fun onConfirmClicked() {
        if (products.value?.isAmountPlaced() == true) {
            _navigateToConfirmation.value = true
        }
    }

    // Livedataupdaters
    private fun updateConfirmButton() {
        _confirmButtonVisible.value = products.value?.isAmountPlaced() == true
    }

    /**
     * Function to be called when a requested viewupdate is executed.
     */
    fun viewUpdateExecuted() {
        _viewUpdateRequired.value = false
    }

    /**
     * Function to be called when navigation has occurred.
     */
    fun doneNavigating() {
        _navigateToConfirmation.value = false
    }

    // Processing
    /**
     * Function to get the placed order as an [Array] of [Order]s.
     *
     * An order is placed in the [Array] for all [ModelProduct]s with amounts > 0
     *
     * @return The requested [Array] of [Order]s
     */
    fun getOrders(): Array<Order> {
        val list = ArrayList<Order>()
        for (product in products.value!!) {
            if (product.amount > 0) {
                list.add(Order(product.name, product.amount, product.price))
            }
        }
        return list.toTypedArray()
    }

    /**
     * Function to build the string to be displayed in the actionbar.
     *
     * @return The [String] with the title
     */
    fun getTitle(): String {
        return "Plaats uw bestelling: Tafel $table"
    }
}
