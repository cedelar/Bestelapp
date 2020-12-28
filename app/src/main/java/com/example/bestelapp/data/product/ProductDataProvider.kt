package com.example.bestelapp.data.product

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ProductDataProvider {

    companion object {
        fun getTestProducts(): MutableLiveData<List<Product>> {
            val dataList = ArrayList<Product>()
            dataList.add(Product("Plat Water", 2.0))
            dataList.add(Product("Coca Cola", 2.0))
            dataList.add(Product("Maes Pils", 2.0))
            dataList.add(Product("Bruiswater", 2.0))
            dataList.add(Product("Cola Zero", 2.0))
            dataList.add(Product("Palm", 2.0))
            val dataListLD = MutableLiveData<List<Product>>()
            dataListLD.value = dataList
            return dataListLD
        }
    }

}