package com.example.bestelapp.fragments.ordersucces

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.bestelapp.data.datawrapper.ServerResponse

/**
 * A [BindingAdapter] to set the message corresponding to the Post response.
 *
 * @param item The used [OrderSuccesViewModel]
 * @see [ServerResponse] [OrderSuccesFragment]
 */
@BindingAdapter("succesMessage")
fun TextView.setMessage(item: OrderSuccesViewModel?) {
    item?.let {
        text = item.getInfoMessage()
    }
}
