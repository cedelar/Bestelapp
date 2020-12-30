package com.example.bestelapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.bestelapp.data.product.ModelProduct
import com.example.bestelapp.data.product.ProductDatabase
import com.example.bestelapp.data.product.asDatabaseProduct
import com.example.bestelapp.data.product.asModelProduct
import com.example.bestelapp.network.ProductApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.await

class ProductRepository(private val database: ProductDatabase) {

    val products: LiveData<List<ModelProduct>> =
        Transformations.map(database.productDatabaseDao.getAllProducts()) { it ->
            it.map { it.asModelProduct() }
        }

    suspend fun refreshProducts() {
        withContext(Dispatchers.IO) {
            val networkProducts = ProductApi.retrofitService.getProducts().await()
            val products =
                networkProducts.map { netProd -> netProd.asDatabaseProduct() }.toTypedArray()
            database.productDatabaseDao.insertAll(*products)
        }
    }
}
