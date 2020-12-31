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

/**
 * The [AndroidViewModel] class for the [ConfirmationFragment]
 *
 * @property orderArray The [Array] of [Order]s to be confirmed
 * @property table The number of the table to be confirming the order
 * @property control The controlnumber corresponding to the tablenumber
 * @author Cedric Delaruelle
 */
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
    /**
     * Function to be called when the 'Next' button is clicked. Sends the confirmed order to the server via Post request.
     *
     * Updates the navigateToSuccesMessage [LiveData] correspondingly depending on succes/failure of the Post request
     * and triggers navigation.
     *
     * @see [DataWrapper] [ProductApi] [ServerResponse]
     */
    fun onNextClicked() {
        sendOrderToServer()
    }

    // Livedataupdaters
    /**
     * Function to be called when navigation has occurred.
     */
    fun doneNavigating() {
        _navigateToSuccesMessage.value = ""
    }

    // Processing
    /**
     * Function to calculate the total price of the [Order]s
     *
     * @return The calculated total
     */
    fun getTotalPrice(): Double {
        var total = 0.0
        for (order in orders) {
            total += (order.price * order.productAmount)
        }
        return total
    }

    /**
     * Function to build the string with orders to be displayed.
     *
     * @return The [String] with orders
     */
    fun getFormattedOrderString(): String {
        val sb = StringBuilder()
        for (order in orders) {
            sb.append(order.productName + ": " + order.productAmount + "x")
            sb.append("\n")
        }
        return sb.toString()
    }

    /**
     * Function to build the string with the total price to be displayed.
     *
     * @return The [String] with the total price
     */
    fun getTotalPriceString(): String {
        return "Totaal: ${getTotalPrice().toInt()} Bonnen"
    }

    /**
     * Function to build the string to be displayed in the actionbar.
     *
     * @return The [String] with the title
     */
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
