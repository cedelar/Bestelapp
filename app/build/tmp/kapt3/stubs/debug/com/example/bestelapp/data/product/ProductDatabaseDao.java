package com.example.bestelapp.data.product;

import java.lang.System;

/**
 * An Interface that defines the [Dao] for the [ProductDatabase]
 *
 * @author Cedric Delaruelle
 * @see [RoomDatabase] [DatabaseProduct]
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\'J!\u0010\r\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000f\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/example/bestelapp/data/product/ProductDatabaseDao;", "", "clear", "", "get", "Lcom/example/bestelapp/data/product/DatabaseProduct;", "key", "", "getAllProducts", "Landroidx/lifecycle/LiveData;", "", "insert", "databaseProduct", "insertAll", "databaseProducts", "", "([Lcom/example/bestelapp/data/product/DatabaseProduct;)V", "update", "app_debug"})
public abstract interface ProductDatabaseDao {
    
    /**
     * Function used to insert a [DatabaseProduct] into the database.
     *
     * @param databaseProduct The inserted [DatabaseProduct]
     */
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.product.DatabaseProduct databaseProduct);
    
    /**
     * Function used to update a [DatabaseProduct] in the database.
     *
     * @param databaseProduct The to be updated [DatabaseProduct]
     */
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.product.DatabaseProduct databaseProduct);
    
    /**
     * Function used to get a specific [DatabaseProduct] from the database.
     *
     * @param key The productId of the required [DatabaseProduct]
     * @return The requested [DatabaseProduct]
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from product_table WHERE product_Id = :key")
    public abstract com.example.bestelapp.data.product.DatabaseProduct get(long key);
    
    /**
     * Function used to get all [DatabaseProduct]s from the database.
     *
     * @return A [LiveData] with a [List] of all [DatabaseProduct]s in the database, ordered by category.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM product_table ORDER BY product_category")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.bestelapp.data.product.DatabaseProduct>> getAllProducts();
    
    /**
     * Function used to insert multiple [DatabaseProduct]s into the database at once.
     *
     * @param databaseProducts The to be inserted [DatabaseProduct]s in an varargs
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.product.DatabaseProduct... databaseProducts);
    
    /**
     * Function used to clear all [DatabaseProduct]s.
     */
    @androidx.room.Query(value = "DELETE FROM product_table")
    public abstract void clear();
}