package com.example.bestelapp.fragments.qr

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import com.example.bestelapp.data.qr.Qr
import com.example.bestelapp.data.qr.QrDatabaseDao


/**
 * A [BindingAdapter] to set the message under the Qr code scanner.
 *
 * @param item The used [LiveData] of the amount of Qr codes in the database.
 * @see [Qr] [QrDatabaseDao] [QrFragment] [QrViewModel]
 */
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
