package com.example.bestelapp.data.product

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * An Interface that defines the [Dao] for the [ProductDatabase]
 *
 * @author Cedric Delaruelle
 * @see [RoomDatabase] [DatabaseProduct]
 */
@Dao
interface ProductDatabaseDao {

    /**
     * Function used to insert a [DatabaseProduct] into the database.
     *
     * @param databaseProduct The inserted [DatabaseProduct]
     */
    @Insert
    fun insert(databaseProduct: DatabaseProduct)

    /**
     * Function used to update a [DatabaseProduct] in the database.
     *
     * @param databaseProduct The to be updated [DatabaseProduct]
     */
    @Update
    fun update(databaseProduct: DatabaseProduct)

    /**
     * Function used to get a specific [DatabaseProduct] from the database.
     *
     * @param key The productId of the required [DatabaseProduct]
     * @return The requested [DatabaseProduct]
     */
    @Query("SELECT * from product_table WHERE product_Id = :key")
    fun get(key: Long): DatabaseProduct?

    /**
     * Function used to get all [DatabaseProduct]s from the database.
     *
     * @return A [LiveData] with a [List] of all [DatabaseProduct]s in the database, ordered by category.
     */
    @Query("SELECT * FROM product_table ORDER BY product_category")
    fun getAllProducts(): LiveData<List<DatabaseProduct>>


    /**
     * Function used to insert multiple [DatabaseProduct]s into the database at once.
     *
     * @param databaseProducts The to be inserted [DatabaseProduct]s in an varargs
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg databaseProducts: DatabaseProduct)

    /**
     * Function used to clear all [DatabaseProduct]s.
     */
    @Query("DELETE FROM product_table")
    fun clear()
}
