package com.example.bestelapp.network

import android.content.Context
import android.net.ConnectivityManager
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import com.example.bestelapp.data.datawrapper.DataWrapper
import com.example.bestelapp.data.datawrapper.ServerResponse
import com.example.bestelapp.data.product.NetworkProduct
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST


private const val BASE_URL = "https://olt-bestelapp.herokuapp.com/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface ProductApiService{
    @GET("artikelen")
    fun getProducts(): Call<List<NetworkProduct>>

    @Headers("Content-Type: application/json")
    @POST("bestel")
    fun sendOrder(@Body data: DataWrapper): Call<ServerResponse>
}

object ProductApi{
    val retrofitService: ProductApiService by lazy{
        retrofit.create(ProductApiService::class.java)
    }
}