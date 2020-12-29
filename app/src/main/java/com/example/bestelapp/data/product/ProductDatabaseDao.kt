package com.example.bestelapp.data.product

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ProductDatabaseDao {

    @Insert
    fun insert(databaseProduct: DatabaseProduct)

    @Update
    fun update(databaseProduct: DatabaseProduct)

    @Query("SELECT * from product_table WHERE product_Id = :key")
    fun get(key: Long): DatabaseProduct?

    @Query("SELECT * FROM product_table ORDER BY product_category")
    fun getAllProducts(): LiveData<List<DatabaseProduct>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg databaseProducts: DatabaseProduct)

    @Query("DELETE FROM product_table")
    fun clear()
}