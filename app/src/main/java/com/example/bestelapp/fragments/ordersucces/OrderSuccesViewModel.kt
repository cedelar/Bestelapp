package com.example.bestelapp.fragments.ordersucces

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class OrderSuccesViewModel(val message: String, application: Application): AndroidViewModel(application)  {
    private var _navigateToTitle = MutableLiveData<Boolean>()

    val navigateToTitle: LiveData<Boolean>
        get() = _navigateToTitle

    fun onBackClicked(){
        _navigateToTitle.value = true
    }

    fun doneNavigating(){
        _navigateToTitle.value = false
    }

    private fun statusOk(): Boolean{
        return message.split("-")[0] == "OK"
    }

    fun getTitle(): String{
        if(statusOk()){
            return "Succes"
        }else{
            return "Fout"
        }
    }

    fun getInfoMessage(): String{
        if(statusOk()){
            return "Uw bestelling is succesvol ontvangen, dit wordt zodadelijk naar uw tafel gebracht. Gelieve het correcte aantal bonnen klaar te leggen!"
        }else{
            return message.split("-")[1]
        }
    }
}