package com.example.bestelapp.fragments.confirmation

import android.app.Application
import android.provider.ContactsContract
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.bestelapp.data.datawrapper.DataWrapper
import com.example.bestelapp.data.datawrapper.Order
import com.example.bestelapp.data.datawrapper.ServerResponse
import com.example.bestelapp.data.datawrapper.asArrayNetworkOrder
import com.example.bestelapp.data.qr.QrDatabaseDao
import com.example.bestelapp.network.ProductApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import java.lang.StringBuilder

class ConfirmationViewModel(val qrDataSource: QrDatabaseDao, val orderArray: Array<Order>, val table: Int, val control: Int, application: Application): AndroidViewModel(application)   {
    private var _navigateToSuccesMessage = MutableLiveData<String>()

    val orders: Array<Order>
        get() = orderArray

    val navigateToSuccesMessage: LiveData<String>
        get() = _navigateToSuccesMessage

    fun onNextClicked(){
        sendOrderToServer()
    }

    fun doneNavigating(){
        _navigateToSuccesMessage.value = ""
    }

    init {
        _navigateToSuccesMessage.value = ""
    }

    private fun getTotalPrice(): Double{
        var total = 0.0;
        for(order in orders){
            total += (order.price * order.productAmount)
        }
        return total
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
        return "Totaal: ${getTotalPrice().toInt()} Bonnen"
    }

    fun getTitle(): String{
        return "Uw bestelling: Tafel $table"
    }

    fun sendOrderToServer(){
        ProductApi.retrofitService.sendOrder(
            DataWrapper(
                control,
                orderArray.asArrayNetworkOrder(),
                table,
                getTotalPrice().toInt()
            )
        ).enqueue(object : Callback<ServerResponse> {
            override fun onFailure(call: Call<ServerResponse>, t: Throwable) {
                Timber.i("Post Failure")
                _navigateToSuccesMessage.value = "NOK-Fout bij verbinden"
            }
            override fun onResponse(
                call: Call<ServerResponse>,
                response: Response<ServerResponse>
            ) {
                Timber.i("Post OK")
                Timber.i(response.toString())
                Timber.i(response.body()?.status)
                _navigateToSuccesMessage.value = response.body()?.status + "-" + response.body()?.reason
            }
        }
        )
    }
}


