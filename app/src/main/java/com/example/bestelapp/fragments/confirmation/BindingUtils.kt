package com.example.bestelapp.fragments.confirmation

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.bestelapp.data.product.ModelProduct

/**
 * A [BindingAdapter] to set the ordered products and amounts to be confirmed.
 *
 * @param item The used [ConfirmationViewModel]
 * @see [ModelProduct] [ConfirmationFragment]
 */
@BindingAdapter("confirmationProducts")
fun TextView.setProducts(item: ConfirmationViewModel?) {
    item?.let {
        text = item.getFormattedOrderString()
    }
}

/**
 * A [BindingAdapter] to set the total price of the products to be confirmed.
 *
 * @param item The used [ConfirmationViewModel]
 * @see [ModelProduct] [ConfirmationFragment]
 */
@BindingAdapter("confirmationTotal")
fun TextView.setTotal(item: ConfirmationViewModel?) {
    item?.let {
        text = item.getTotalPriceString()
    }
}
