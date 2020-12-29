package com.example.bestelapp.fragments.confirmation

import android.app.Application
import android.telecom.Call
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.bestelapp.data.Order
import com.example.bestelapp.network.ProductApi
import okhttp3.Response
import java.lang.StringBuilder
import javax.security.auth.callback.Callback

class ConfirmationViewModel(val orderArray: Array<Order>, application: Application): AndroidViewModel(application)   {
    private var _navigateToSucces = MutableLiveData<Boolean>()

    val orders: Array<Order>
        get() = orderArray

    val navigateToSucces: LiveData<Boolean>
        get() = _navigateToSucces

    fun onNextClicked(){
        _navigateToSucces.value = true
    }

    fun doneNavigating(){
        _navigateToSucces.value = false
    }

    fun getFormattedOrderString() : String{
        val sb = StringBuilder()
        for(order in orders){
            sb.append(order.productName + ":\t\t\t\t" + order.productAmount + "x")
            sb.append("\n")
        }
        return sb.toString()
    }

    fun getTotalPriceString() : String{
        var total = 0.0;
        for(order in orders){
            total += (order.price * order.productAmount)
        }

        return "Totaal: ${total.toInt()} Bonnen"
    }
}