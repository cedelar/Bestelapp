package com.example.bestelapp.fragments.orderlist

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.bestelapp.R
import com.example.bestelapp.data.product.Product

@BindingAdapter("productImage")
fun ImageView.setProductImage(item: Product?){
    item?.let {
        setImageResource(R.drawable.ic_android)
    }
}

@BindingAdapter("productName")
fun TextView.setProductName(item: Product?){
    item?.let {
        text = item.name
    }
}

@BindingAdapter("productPrice")
fun TextView.setProductPrice(item: Product?){
    item?.let {
        text = item.price.toString()
    }
}

@BindingAdapter("productDescription")
fun TextView.setProductDescription(item: Product?){
    item?.let {
        text = item.description
    }
}