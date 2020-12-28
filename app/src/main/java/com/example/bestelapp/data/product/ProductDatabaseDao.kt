package com.example.bestelapp.data.product

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDatabaseDao {

    @Insert
    fun insert(product: Product)

    @Update
    fun update(product: Product)

    @Query("SELECT * from product_table WHERE product_Id = :key")
    fun get(key: Long): Product?

    @Query("SELECT * FROM product_table ORDER BY product_category")
    fun getAllProducts(): LiveData<List<Product>>
}