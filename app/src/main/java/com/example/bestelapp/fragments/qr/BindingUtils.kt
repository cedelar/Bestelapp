package com.example.bestelapp.fragments.qr

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData

@BindingAdapter("qrInfo")
fun TextView.setInfo(item: LiveData<Int>?) {
    item?.let {
        if (item.value.toString() == "null") {
            "Gelieve uw QR code te scannen".also { text = it }
        } else {
            ("Tafel " + item.value.toString()).also { text = it }
        }
    }
}
