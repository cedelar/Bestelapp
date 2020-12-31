package com.example.bestelapp.fragments.orderlist

import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.bestelapp.R
import com.example.bestelapp.data.product.ModelProduct

/**
 * A [BindingAdapter] to set the picture of the displayed Product.
 *
 * @param item The used [ModelProduct]
 * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
 */
@BindingAdapter("productImage")
fun ImageView.setProductImage(item: ModelProduct?) {
    item?.pictureLink?.let {
        val imgUri = item.pictureLink.toUri().buildUpon().scheme("https").build()
        Glide.with(context)
            .load(imgUri)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.loading_animation)
                    .error(R.drawable.ic_broken_image)
            )
            .into(this)
    }
}

/**
 * A [BindingAdapter] to set the name of the displayed Product.
 *
 * @param item The used [ModelProduct]
 * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
 */
@BindingAdapter("productName")
fun TextView.setProductName(item: ModelProduct?) {
    item?.let {
        text = item.name
    }
}

/**
 * A [BindingAdapter] to set the price of the displayed Product.
 *
 * @param item The used [ModelProduct]
 * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
 */
@BindingAdapter("productPrice")
fun TextView.setProductPrice(item: ModelProduct?) {
    item?.let {
        (item.price.toInt().toString() + " bonnen").also { text = it }
    }
}

/**
 * A [BindingAdapter] to set the description of the displayed Product.
 *
 * @param item The used [ModelProduct]
 * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
 */
@BindingAdapter("productDescription")
fun TextView.setProductDescription(item: ModelProduct?) {
    item?.let {
        text = item.description
    }
}

/**
 * A [BindingAdapter] to set the amount of the displayed Product.
 *
 * @param item The used [ModelProduct]
 * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
 */
@BindingAdapter("productAmount")
fun TextView.setProductAmount(item: ModelProduct?) {
    item?.let {
        text = item.amount.toString()
    }
}
