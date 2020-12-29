package com.example.bestelapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Order(
    var productName: String,
    var productAmount: Int,
    var price: Double
): Parcelable