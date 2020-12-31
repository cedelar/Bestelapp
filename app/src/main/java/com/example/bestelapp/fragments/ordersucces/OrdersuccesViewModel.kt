package com.example.bestelapp.fragments.ordersucces

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * The [AndroidViewModel] class for the [OrdersuccesFragment]
 *
 * @property message The message to be displayed
 * @author Cedric Delaruelle
 */
class OrdersuccesViewModel(private val message: String, application: Application) :
    AndroidViewModel(application) {

    // Value init
    private var _navigateToTitle = MutableLiveData<Boolean>()
    val navigateToTitle: LiveData<Boolean>
        get() = _navigateToTitle

    // Buttonhandlers
    /**
     * Function to be called when the 'Back' button is clicked.
     *
     * Triggers navigation
     */
    fun onBackClicked() {
        _navigateToTitle.value = true
    }

    // Livedataupdaters
    /**
     * Function to be called when navigation has occurred.
     */
    fun doneNavigating() {
        _navigateToTitle.value = false
    }

    private fun statusOk(): Boolean {
        return message.split("-")[0] == "OK"
    }

    // Processing
    /**
     * Function to build the string to be displayed in the actionbar.
     *
     * @return The [String] with the title
     */
    fun getTitle(): String {
        return if (statusOk()) {
            "Succes"
        } else {
            "Fout"
        }
    }

    /**
     * Function to build the string with the infomessage to be displayed.
     *
     * @return The requested [String]
     */
    fun getInfoMessage(): String {
        return if (statusOk()) {
            "Uw bestelling is succesvol ontvangen, dit wordt zodadelijk naar uw tafel gebracht. Gelieve het correcte aantal bonnen klaar te leggen!"
        } else {
            message.split("-")[1]
        }
    }
}
