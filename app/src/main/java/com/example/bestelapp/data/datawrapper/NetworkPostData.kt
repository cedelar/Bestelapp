package com.example.bestelapp.data.datawrapper

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataWrapper(
    @Json(name = "controle")
    val controlNumber: Int,
    @Json(name = "bestelling")
    val orders: List<NetworkOrder>,
    @Json(name = "tafel")
    val tableNumber: Int,
    @Json(name = "prijs")
    val price: Int
    )

@JsonClass(generateAdapter = true)
data class NetworkOrder(
    @Json(name = "artikel")
    val product: ProductNameWrapper,
    @Json(name = "aantal")
    val amount: Int,
    @Json(name = "opties")
    val options: List<String>
)

@JsonClass(generateAdapter = true)
data class ProductNameWrapper(
    @Json(name = "naam")
    val name: String,
)

fun String.toProductNameWrapper(): ProductNameWrapper{
    return ProductNameWrapper(this)
}

@JsonClass(generateAdapter = true)
data class ServerResponse(
    @Json(name = "status")
    val status: String,
    @Json(name = "reason")
    val reason: String
)