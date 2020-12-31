package com.example.bestelapp.network

import com.example.bestelapp.data.datawrapper.DataWrapper
import com.example.bestelapp.data.datawrapper.ServerResponse
import com.example.bestelapp.data.product.ModelProduct
import com.example.bestelapp.data.product.NetworkProduct
import com.example.bestelapp.fragments.orderlist.ProductAdapter.ViewHolder
import com.example.bestelapp.fragments.orderlist.ProductItemListener
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

/**
 * An interface detailing API calls to the 'olt-bestelapp.herokuapp.com' server.
 *
 * @author Cedric Delaruelle
 */
interface ProductApiService {
    /**
     * Function sending a Get request to the '/artikelen' endpoint of the server.
     *
     * @return A [Call] containing the [List] of [NetworkProduct] that the server send.
     */
    @GET("artikelen")
    fun getProducts(): Call<List<NetworkProduct>>

    /**
     * Function sending a Post request to the '/bestel' endpoint of the server.
     *
     * @param data The [DataWrapper] object to be send to the server
     * @return A [Call] containing the [ServerResponse] that the server send.
     */
    @Headers("Content-Type: application/json")
    @POST("bestel")
    fun sendOrder(@Body data: DataWrapper): Call<ServerResponse>
}

/**
 * An object with the purpose of returning a [ProductApiService] with a Moshi Json parser set to
 * the 'olt-bestelapp.herokuapp.com' server.
 *
 * @param data The [DataWrapper] object to be send to the server
 * @return A [Call] containing the [ServerResponse] that the server send.
 */
object ProductApi {
    val retrofitService: ProductApiService by lazy {
        retrofit.create(ProductApiService::class.java)
    }
}
