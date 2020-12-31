package com.example.bestelapp.data.datawrapper

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Moshi Json convertable data class used as body in Post requests to the server.
 *
 * @property controlNumber The controlnumber of the table
 * @property orders A list of [NetworkOrder]
 * @property tableNumber The number of the table
 * @property price The combined price of the orders
 * @constructor Creates a [DataWrapper].
 * @see NetworkOrder
 * @author Cedric Delaruelle
 */
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

/**
 * Moshi Json convertable data class used to wrap the orders in Post requests to the server.
 *
 * @property product A [ProductNameWrapper] with the ordered product
 * @property amount The amount of ordered products
 * @property options A list of [String] with the chosen options
 * @constructor Creates a [NetworkOrder].
 * @see ProductNameWrapper
 * @author Cedric Delaruelle
 */
@JsonClass(generateAdapter = true)
data class NetworkOrder(
    @Json(name = "artikel")
    val product: ProductNameWrapper,
    @Json(name = "aantal")
    val amount: Int,
    @Json(name = "opties")
    val options: List<String>
)

/**
 * Moshi Json convertable data class used to wrap the productdetails in Post requests to the server.
 *
 * @property name A [String] with the name of the product
 * @constructor Creates a [ProductNameWrapper].
 * @author Cedric Delaruelle
 */
@JsonClass(generateAdapter = true)
data class ProductNameWrapper(
    @Json(name = "naam")
    val name: String,
)

/**
 * An extension function to convert a [String] into a [ProductNameWrapper]
 *
 * @receiver A [String]
 * @return The corresponding [ProductNameWrapper]
 */
fun String.asProductNameWrapper(): ProductNameWrapper {
    return ProductNameWrapper(this)
}

/**
 * Moshi Json convertable data class used to wrap the response from a Post requests from the server.
 *
 * @property status A [String] with the return status ("OK" or "NOK")
 * @property reason If status "NOK": A [String] with the reason for the failed order
 * @constructor Creates a [ServerResponse].
 * @author Cedric Delaruelle
 */
@JsonClass(generateAdapter = true)
data class ServerResponse(
    @Json(name = "status")
    val status: String,
    @Json(name = "reason")
    val reason: String
)
