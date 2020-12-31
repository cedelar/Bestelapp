package com.example.bestelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bestelapp.data.product.ModelProduct
import timber.log.Timber

/**
 * The [AppCompatActivity] detailing the main activity of the app.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(Timber.DebugTree())
    }
}
