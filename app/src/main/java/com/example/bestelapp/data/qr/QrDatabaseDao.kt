package com.example.bestelapp.data.qr

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase

/**
 * An Interface that defines the [Dao] for the [QrDatabase]
 *
 * @author Cedric Delaruelle
 * @see [RoomDatabase] [Qr]
 */
@Dao
interface QrDatabaseDao {

    /**
     * Function used to insert a [Qr] into the database.
     *
     * @param qr The inserted [Qr]
     */
    @Insert
    fun insert(qr: Qr)

    /**
     * Function used to clear all [Qr]s.
     */
    @Query("DELETE FROM qr_table")
    fun clear()

    /**
     * Function used to get the saved [Qr] from the database.
     *
     * @return A [LiveData] of the saved [Qr]
     */
    @Query("SELECT * FROM qr_table LIMIT 1")
    fun getQr(): LiveData<Qr>

    /**
     * Function used to get the amount of saved [Qr] in the database. Should always be 0 or 1.
     *
     * @return A [LiveData] of the amount of [Qr]s in the database.
     */
    @Query("SELECT COUNT(*) FROM qr_table")
    fun getQrCount(): LiveData<Int>
}
