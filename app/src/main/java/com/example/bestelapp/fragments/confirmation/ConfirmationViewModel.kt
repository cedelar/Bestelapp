package com.example.bestelapp.fragments.confirmation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.bestelapp.data.datawrapper.DataWrapper
import com.example.bestelapp.data.datawrapper.Order
import com.example.bestelapp.data.datawrapper.ServerResponse
import com.example.bestelapp.data.datawrapper.asArrayNetworkOrder
import com.example.bestelapp.network.ProductApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.StringBuilder

class ConfirmationViewModel(
    private val orderArray: Array<Order>,
    val table: Int,
    val control: Int,
    application: Application
) : AndroidViewModel(application) {
    // Value Init
    private var _navigateToSuccesMessage = MutableLiveData<String>()
    val navigateToSuccesMessage: LiveData<String>
        get() = _navigateToSuccesMessage

    private val orders: Array<Order>
        get() = orderArray

    init {
        _navigateToSuccesMessage.postValue("")
    }

    // Buttonhandlers
    fun onNextClicked() {
        sendOrderToServer()
    }

    // Livedataupdaters
    fun doneNavigating() {
        _navigateToSuccesMessage.value = ""
    }

    // Processing
    fun getTotalPrice(): Double {
        var total = 0.0
        for (order in orders) {
            total += (order.price * order.productAmount)
        }
        return total
    }

    fun getFormattedOrderString(): String {
        val sb = StringBuilder()
        for (order in orders) {
            sb.append(order.productName + ": " + order.productAmount + "x")
            sb.append("\n")
        }
        return sb.toString()
    }

    fun getTotalPriceString(): String {
        return "Totaal: ${getTotalPrice().toInt()} Bonnen"
    }

    fun getTitle(): String {
        return "Uw bestelling: Tafel $table"
    }

    // API calls
    private fun sendOrderToServer() {
        ProductApi.retrofitService.sendOrder(
            DataWrapper(
                control,
                orderArray.asArrayNetworkOrder(),
                table,
                getTotalPrice().toInt()
            )
        ).enqueue(
            object : Callback<ServerResponse> {
                override fun onFailure(call: Call<ServerResponse>, t: Throwable) {
                    _navigateToSuccesMessage.value = "NOK-Fout bij verbinden"
                }

                override fun onResponse(
                    call: Call<ServerResponse>,
                    response: Response<ServerResponse>
                ) {
                    _navigateToSuccesMessage.value =
                        response.body()?.status + "-" + response.body()?.reason
                }
            }
        )
    }
}
