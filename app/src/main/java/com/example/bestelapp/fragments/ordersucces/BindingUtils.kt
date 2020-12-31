package com.example.bestelapp.fragments.ordersucces

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.bestelapp.data.datawrapper.ServerResponse

/**
 * A [BindingAdapter] to set the message corresponding to the Post response.
 *
 * @param item The used [OrdersuccesViewModel]
 * @see [ServerResponse] [OrdersuccesFragment]
 */
@BindingAdapter("succesMessage")
fun TextView.setMessage(item: OrdersuccesViewModel?) {
    item?.let {
        text = item.getInfoMessage()
    }
}
