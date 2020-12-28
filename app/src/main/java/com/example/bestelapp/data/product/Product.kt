package com.example.bestelapp.data.product

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class Product (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "product_id")
    var productId: Long = 0L,

    @ColumnInfo(name = "product_name")
    var name: String = "",

    @ColumnInfo(name = "product_price")
    var price: Double = 0.0,

    @ColumnInfo
    var description: String = "No description available",

    @ColumnInfo(name = "product_picturelink")
    var pictureLink: String = "",

    @ColumnInfo(name = "product_category")
    val category: String = "No Category",

    //@ColumnInfo(name = "product_options_list")
    //val options: List<String> = ArrayList(),

    @ColumnInfo(name = "product_availability")
    val available: Boolean = true

){
    constructor(name2: String, price2: Double) : this(name = name2, price = price2)
}