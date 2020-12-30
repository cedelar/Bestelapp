package com.example.bestelapp.fragments.confirmation

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("confirmationProducts")
fun TextView.setProducts(item: ConfirmationViewModel?) {
    item?.let {
        text = item.getFormattedOrderString()
    }
}

@BindingAdapter("confirmationTotal")
fun TextView.setTotal(item: ConfirmationViewModel?) {
    item?.let {
        text = item.getTotalPriceString()
    }
}
