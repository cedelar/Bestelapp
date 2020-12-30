package com.example.bestelapp.fragments.ordersucces

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.bestelapp.fragments.confirmation.ConfirmationViewModel

@BindingAdapter("succesMessage")
fun TextView.setMessage(item: OrderSuccesViewModel?){
    item?.let {
        text = item.getInfoMessage()
    }
}