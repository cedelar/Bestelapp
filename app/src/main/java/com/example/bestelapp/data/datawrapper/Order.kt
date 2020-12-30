package com.example.bestelapp.data.datawrapper

import android.os.Parcelable
import androidx.compose.ui.res.stringArrayResource
import kotlinx.android.parcel.Parcelize

@Parcelize
class Order(
    var productName: String,
    var productAmount: Int,
    var price: Double
): Parcelable

fun Order.asNetworkOrder(): NetworkOrder{
return NetworkOrder(productName.toProductNameWrapper(), productAmount, listOf())
}

fun Array<Order>.asArrayNetworkOrder(): List<NetworkOrder>{
    return this.map{
        it.asNetworkOrder()
    }
}