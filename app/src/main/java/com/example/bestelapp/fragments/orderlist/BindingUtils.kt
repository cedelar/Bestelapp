package com.example.bestelapp.fragments.orderlist

import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.bestelapp.R
import com.example.bestelapp.data.product.ModelProduct

@BindingAdapter("productImage")
fun ImageView.setProductImage(item: ModelProduct?){

    item?.pictureLink?.let {
        val imgUri = item?.pictureLink?.toUri().buildUpon().scheme("https").build()
        Glide.with(context)
            .load(imgUri)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_broken_image))
            .into(this)
    }
}

@BindingAdapter("productName")
fun TextView.setProductName(item: ModelProduct?){
    item?.let {
        text = item.name
    }
}

@BindingAdapter("productPrice")
fun TextView.setProductPrice(item: ModelProduct?){
    item?.let {
        (item.price.toInt().toString() + " bonnen").also { text = it }
    }
}

@BindingAdapter("productDescription")
fun TextView.setProductDescription(item: ModelProduct?){
    item?.let {
        text = item.description
    }
}

@BindingAdapter("productAmount")
fun TextView.setProductAmount(item: ModelProduct?){
    item?.let {
        text = item.amount.toString()
    }
}
