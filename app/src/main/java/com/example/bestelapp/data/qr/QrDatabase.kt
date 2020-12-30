package com.example.bestelapp.data.qr

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Qr::class], version = 1, exportSchema = false)
abstract class QrDatabase : RoomDatabase() {
    abstract val qrDatabaseDao: QrDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: QrDatabase? = null

        fun getInstance(context: Context): QrDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        QrDatabase::class.java,
                        "qr_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}
