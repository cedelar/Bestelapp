package com.example.bestelapp.data.product

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * An abstract class of the database with products.
 *
 * @constructor Creates a [ProductDatabase].
 * @author Cedric Delaruelle
 * @see [RoomDatabase] [DatabaseProduct] [ProductDatabaseDao]
 */
@Database(entities = [DatabaseProduct::class], version = 4, exportSchema = false)
abstract class ProductDatabase : RoomDatabase() {
    abstract val productDatabaseDao: ProductDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: ProductDatabase? = null

        /**
         * Used to get an instance of  [ProductDatabaseDao].
         *
         * @param context the application [Context]
         * @return The requested [ProductDatabase]
         */
        fun getInstance(context: Context): ProductDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ProductDatabase::class.java,
                        "product_database"
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
