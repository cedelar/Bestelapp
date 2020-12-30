package com.example.bestelapp.fragments.ordersucces

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class OrderSuccesViewModel(private val message: String, application: Application) :
    AndroidViewModel(application) {

    // Value init
    private var _navigateToTitle = MutableLiveData<Boolean>()
    val navigateToTitle: LiveData<Boolean>
        get() = _navigateToTitle

    // Buttonhandlers
    fun onBackClicked() {
        _navigateToTitle.value = true
    }

    // Livedataupdaters
    fun doneNavigating() {
        _navigateToTitle.value = false
    }

    private fun statusOk(): Boolean {
        return message.split("-")[0] == "OK"
    }

    // Processing
    fun getTitle(): String {
        return if (statusOk()) {
            "Succes"
        } else {
            "Fout"
        }
    }

    fun getInfoMessage(): String {
        return if (statusOk()) {
            "Uw bestelling is succesvol ontvangen, dit wordt zodadelijk naar uw tafel gebracht. Gelieve het correcte aantal bonnen klaar te leggen!"
        } else {
            message.split("-")[1]
        }
    }
}
