package com.example.bestelapp.data.datawrapper

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * A parcelable class to pass orders between fragments.
 *
 * @property productName The name of the product
 * @property productAmount The amount of the product
 * @property price The price of a single product
 * @constructor Creates an [Order].
 * @see Parcelable
 * @author Cedric Delaruelle
 */
@Parcelize
class Order(
    var productName: String,
    var productAmount: Int,
    var price: Double
) : Parcelable

/**
 * An extension function to convert an [Order] into a [NetworkOrder].
 * @receiver An [Order]
 * @return The corresponding [NetworkOrder]
 */
fun Order.asNetworkOrder(): NetworkOrder {
    return NetworkOrder(productName.asProductNameWrapper(), productAmount, listOf())
}

/**
 * An extension function to convert a [Order] array into a [NetworkOrder] array.
 *
 * @receiver An [Array] of [Order]s
 * @return The corresponding [List] of [NetworkOrder]s
 */
fun Array<Order>.asArrayNetworkOrder(): List<NetworkOrder> {
    return this.map {
        it.asNetworkOrder()
    }
}
