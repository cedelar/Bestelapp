package com.example.bestelapp.network

import com.example.bestelapp.data.product.NetworkProduct
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

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
}

object ProductApi{
    val retrofitService: ProductApiService by lazy{
        retrofit.create(ProductApiService::class.java)
    }
}