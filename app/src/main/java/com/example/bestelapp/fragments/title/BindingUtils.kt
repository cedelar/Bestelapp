package com.example.bestelapp.fragments.title

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import com.example.bestelapp.data.qr.Qr
import com.example.bestelapp.data.qr.QrDatabaseDao

/**
 * A [BindingAdapter] to set an infomessage.
 *
 * @param item The used [LiveData] of the amount of Qr codes in the database.
 * @see [Qr] [QrDatabaseDao] [TitleFragment] [TitleViewModel]
 */
@BindingAdapter("titleTable")
fun TextView.setTable(item: LiveData<Qr>?) {
    item?.let {
        if (item.value == null) {
            "Gelieve je QR code te scannen".also { text = it }
        } else {
            ("Tafel " + item.value!!.tableNumber.toString()).also { text = it }
        }
    }
}
