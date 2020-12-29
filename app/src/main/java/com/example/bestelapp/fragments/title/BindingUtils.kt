package com.example.bestelapp.fragments.title

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import com.example.bestelapp.data.qr.Qr

@BindingAdapter("titleInfo")
fun TextView.setInfo(item: LiveData<Qr>?){
    item?.let {
        if(item.value == null){
            "Welkom bij OLT Kemzeke!\nGelieve je QR code te scannen".also { text = it }
        }else{
            ("Welkom bij OLT Kemzeke!\nTafel " + item.value!!.tableNumber.toString()).also { text = it }
        }
    }
}