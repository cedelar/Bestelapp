package com.example.bestelapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.bestelapp.data.product.*
import com.example.bestelapp.network.ProductApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.await

/**
 * A repository class containing cashed Product data.
 *
 * @param database The [ProductDatabase] containing the [DatabaseProduct]s
 * @see [ProductApi]
 */
class ProductRepository(private val database: ProductDatabase) {

    val products: LiveData<List<ModelProduct>> =
        Transformations.map(database.productDatabaseDao.getAllProducts()) { it ->
            it.map { it.asModelProduct() }
        }

    /**
     * A function to refresh the contents of the cashe from the server.
     *
     * @see [ProductApi]
     */
    suspend fun refreshProducts() {
        withContext(Dispatchers.IO) {
            val networkProducts = ProductApi.retrofitService.getProducts().await()
            val products =
                networkProducts.map { netProd -> netProd.asDatabaseProduct() }.toTypedArray()
            database.productDatabaseDao.insertAll(*products)
        }
    }
}
