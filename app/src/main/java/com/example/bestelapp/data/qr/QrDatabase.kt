package com.example.bestelapp.data.qr

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * An abstract class of the database with Qr codes.
 *
 * @constructor Creates a [QrDatabase].
 * @author Cedric Delaruelle
 * @see [RoomDatabase] [Qr] [QrDatabaseDao]
 */
@Database(entities = [Qr::class], version = 1, exportSchema = false)
abstract class QrDatabase : RoomDatabase() {
    abstract val qrDatabaseDao: QrDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: QrDatabase? = null

        /**
         * Used to get an instance of  [QrDatabaseDao].
         *
         * @param context the application [Context]
         * @return The requested [QrDatabase]
         */
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
