package com.example.bestelapp.data.product

import android.graphics.ColorSpace
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class ModelProduct(
    val productId: Long,
    val name: String,
    val price: Double,
    val description: String,
    val pictureLink: String,
    val category: String,
    val available: Boolean,
    var amount: Int = 0
    ){
    constructor(productId_: Long,
                name_: String,
                price_: Double,
                description_: String,
                pictureLink_: String,
                category_: String,
                available_: Boolean
    ) : this(productId = productId_,
        name = name_,
        price = price_,
        description = description_,
        pictureLink = pictureLink_,
        category = category_,
        available = available_
    )

    fun increment(){
        amount++
    }

    fun decrement(){
        if(amount > 0){
            amount--
        }
    }
}

    fun List<ModelProduct>.incrementByName(name: String){
        this.find { prod -> prod.name == name }?.increment()
    }

    fun List<ModelProduct>.decrementByName(name: String){
        this.find { prod -> prod.name == name }?.decrement()
    }

    fun List<ModelProduct>.isAmountPlaced(): Boolean {
        for (product in this){
            if(product.amount > 0){
                return true
            }
        }
        return false
    }

@Entity(tableName = "product_table", indices = arrayOf(Index(value = ["product_name"], unique = true)))
data class DatabaseProduct (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "product_id")
    val productId: Long = 0L,

    @ColumnInfo(name = "product_name")
    val name: String = "",

    @ColumnInfo(name = "product_price")
    val price: Double = 0.0,

    @ColumnInfo(name = "product_description")
    val description: String = "No description available",

    @ColumnInfo(name = "product_picturelink")
    val pictureLink: String = "",

    @ColumnInfo(name = "product_category")
    val category: String = "No Category",

    @ColumnInfo(name = "product_availability")
    val available: Boolean = true,
){
    constructor(id2: Long, name2: String, price2: Double) : this(productId = id2, name = name2, price = price2)
    constructor(name_: String,
                price_: Double,
                description_: String,
                pictureLink_: String,
                category_: String,
                available_: Boolean
    ) : this(name = name_,
        price = price_,
        description = description_,
        pictureLink = pictureLink_,
        category = category_,
        available = available_
    )
}

fun DatabaseProduct.asModelProduct(): ModelProduct{
    return ModelProduct(
        this.productId,
        this.name,
        this.price,
        this.description,
        this.pictureLink,
        this.category,
        this.available
    )
}

private const val BASE_URL = "https://olt-bestelapp.herokuapp.com/"

@JsonClass(generateAdapter = true)
data class NetworkProduct(
    @Json(name = "naam")
    val name: String,
    @Json(name = "prijs")
    val price: Int,
    @Json(name = "beschrijving")
    val description: String,
    @Json(name = "link")
    val pictureLink: String,
    @Json(name = "categorie")
    val category: String,
    @Json(name = "beschikbaar")
    val available: String
)

fun NetworkProduct.asDatabaseProduct(): DatabaseProduct {
    val availableBool : Boolean = this.available == "Ja"
    val pictureLinkRefactor: String = BASE_URL + this.pictureLink.substring(6).replace(" ", "%20")
    return DatabaseProduct(
        this.name,
        this.price.toDouble(),
        this.description,
        pictureLinkRefactor,
        this.category,
        availableBool
    )
}
