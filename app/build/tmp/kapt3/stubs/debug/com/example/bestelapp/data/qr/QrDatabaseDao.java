package com.example.bestelapp.data.qr;

import java.lang.System;

/**
 * An Interface that defines the [Dao] for the [QrDatabase]
 *
 * @author Cedric Delaruelle
 * @see [RoomDatabase] [Qr]
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/bestelapp/data/qr/QrDatabaseDao;", "", "clear", "", "getQr", "Landroidx/lifecycle/LiveData;", "Lcom/example/bestelapp/data/qr/Qr;", "getQrCount", "", "insert", "qr", "app_debug"})
public abstract interface QrDatabaseDao {
    
    /**
     * Function used to insert a [Qr] into the database.
     *
     * @param qr The inserted [Qr]
     */
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.qr.Qr qr);
    
    /**
     * Function used to clear all [Qr]s.
     */
    @androidx.room.Query(value = "DELETE FROM qr_table")
    public abstract void clear();
    
    /**
     * Function used to get the saved [Qr] from the database.
     *
     * @return A [LiveData] of the saved [Qr]
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM qr_table LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.example.bestelapp.data.qr.Qr> getQr();
    
    /**
     * Function used to get the amount of saved [Qr] in the database. Should always be 0 or 1.
     *
     * @return A [LiveData] of the amount of [Qr]s in the database.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM qr_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getQrCount();
}