package com.example.bestelapp.data.qr

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QrDatabaseDao {

    @Insert
    fun insert(qr: Qr)

    @Query("DELETE FROM qr_table")
    fun clear()

    @Query("SELECT * FROM qr_table LIMIT 1")
    fun getQr(): LiveData<Qr>

    @Query("SELECT COUNT(*) FROM qr_table")
    fun getQrCount(): LiveData<Int>
}
