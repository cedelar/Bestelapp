package com.example.bestelapp.data.product

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A data class to represent a Product in the app
 *
 * @property productId The id of the product
 * @property name The name of the product
 * @property price The price of the product
 * @property description The description of the product
 * @property pictureLink The weblink to the picture of the product
 * @property category The category of the product
 * @property available The availability of the product
 * @property amount The currently displayed, ordered amount
 * @constructor Creates a [ModelProduct].
 * @author Cedric Delaruelle
 */
data class ModelProduct(
    val productId: Long,
    val name: String,
    val price: Double,
    val description: String,
    val pictureLink: String,
    val category: String,
    val available: Boolean,
    var amount: Int = 0
) {
    constructor(
        productId_: Long,
        name_: String,
        price_: Double,
        description_: String,
        pictureLink_: String,
        category_: String,
        available_: Boolean
    ) : this(
        productId = productId_,
        name = name_,
        price = price_,
        description = description_,
        pictureLink = pictureLink_,
        category = category_,
        available = available_
    )

    /**
     * A function to increase the amount field of the [ModelProduct] by 1
     */
    fun increment() {
        amount++
    }

    /**
     * A function to decrease the amount field of the [ModelProduct] by 1
     */
    fun decrement() {
        if (amount > 0) {
            amount--
        }
    }
}

/**
 * An extension function to increase the amount field of a [ModelProduct] in a [List] by 1
 *
 * @param name The name of the required [ModelProduct]
 * @receiver A [List] of [ModelProduct]s
 */
fun List<ModelProduct>.incrementByName(name: String) {
    this.find { prod -> prod.name == name }?.increment()
}

/**
 * An extension function to decrease the amount field of a [ModelProduct] in a [List] by 1
 *
 * @param name The name of the required [ModelProduct]
 * @receiver A [List] of [ModelProduct]s
 */
fun List<ModelProduct>.decrementByName(name: String) {
    this.find { prod -> prod.name == name }?.decrement()
}

/**
 * An extension function to check if the amount field of at least 1 [ModelProduct] in a [List] is > 0
 *
 * @receiver A [List] of [ModelProduct]s
 * @return A [Boolean]
 */
fun List<ModelProduct>.isAmountPlaced(): Boolean {
    for (product in this) {
        if (product.amount > 0) {
            return true
        }
    }
    return false
}

/**
 * An Entity data class to represent a Product in the database.
 *
 * @property productId The id of the product
 * @property name The name of the product
 * @property price The price of the product
 * @property description The description of the product
 * @property pictureLink The weblink to the picture of the product
 * @property category The category of the product
 * @property available The availability of the product
 * @constructor Creates a [DatabaseProduct].
 * @author Cedric Delaruelle
 */
@Entity(
    tableName = "product_table",
    indices = [Index(value = ["product_name"], unique = true)]
)
data class DatabaseProduct(
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
) {
    constructor(
        name_: String,
        price_: Double,
        description_: String,
        pictureLink_: String,
        category_: String,
        available_: Boolean
    ) : this(
        name = name_,
        price = price_,
        description = description_,
        pictureLink = pictureLink_,
        category = category_,
        available = available_
    )
}

/**
 * An extension function to convert a [DatabaseProduct] into a [ModelProduct].
 *
 * @receiver A [DatabaseProduct]
 * @return The corresponding [ModelProduct]
 */
fun DatabaseProduct.asModelProduct(): ModelProduct {
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

/**
 * Moshi Json convertable data class to represent a Product in an API call.
 *
 * @property name The name of the product
 * @property price The price of the product
 * @property description The description of the product
 * @property pictureLink The weblink to the picture of the product
 * @property category The category of the product
 * @property available The availability of the product
 * @constructor Creates a [NetworkProduct].
 * @author Cedric Delaruelle
 */
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

/**
 * An extension function to convert a [NetworkProduct] into a [DatabaseProduct].
 *
 * @receiver A [NetworkProduct]
 * @return The corresponding [DatabaseProduct]
 */
fun NetworkProduct.asDatabaseProduct(): DatabaseProduct {
    val availableBool: Boolean = this.available == "Ja"
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
