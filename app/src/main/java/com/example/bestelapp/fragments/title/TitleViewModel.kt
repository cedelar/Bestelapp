package com.example.bestelapp.fragments.title

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.bestelapp.data.qr.QrDatabaseDao

class TitleViewModel(database: QrDatabaseDao, application: Application) :
    AndroidViewModel(application) {

    // Value init
    private var _navigateToOrderlist = MutableLiveData<Boolean>()
    val navigateToOrderlist: LiveData<Boolean>
        get() = _navigateToOrderlist

    private var _navigateToQr = MutableLiveData<Boolean>()
    val navigateToQr: LiveData<Boolean>
        get() = _navigateToQr

    private var _navigateToSponsor = MutableLiveData<Boolean>()
    val navigateToSponsor: LiveData<Boolean>
        get() = _navigateToSponsor

    val qrInDatabase = database.getQr()
    val orderButtonVisible: LiveData<Boolean> = Transformations.map(database.getQrCount()) {
        it == 1
    }

    // Buttonhandlers
    fun onOrderClicked() {
        _navigateToOrderlist.value = true
    }

    fun onQrClicked() {
        _navigateToQr.value = true
    }

    fun onSponsorClicked() {
        _navigateToSponsor.value = true
    }

    // Livedataupdaters
    fun doneNavigating() {
        _navigateToOrderlist.value = false
        _navigateToQr.value = false
        _navigateToSponsor.value = false
    }

    // Processing
    fun getTitle(): String {
        return "OLT Bestelapp"
    }
}
