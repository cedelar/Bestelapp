package com.example.bestelapp.fragments.title

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.bestelapp.data.product.ProductDatabaseDao
import com.example.bestelapp.data.qr.QrDatabaseDao

class TitleViewModel(val database: QrDatabaseDao, application: Application): AndroidViewModel(application) {

    //Navigation
    private var _navigateToOrderlist = MutableLiveData<Boolean>()
    private var _navigateToQr = MutableLiveData<Boolean>()
    private var _navigateToSponsor= MutableLiveData<Boolean>()

    val navigateToOrderlist: LiveData<Boolean>
        get() = _navigateToOrderlist
    val navigateToQr: LiveData<Boolean>
        get() = _navigateToQr
    val navigateToSponsor: LiveData<Boolean>
        get() = _navigateToSponsor

    val qrInDatabase = database.getQr()
    val orderButtonVisible = Transformations.map(database.getQrCount()){
        it == 1
    }

    fun onOrderClicked(){
        _navigateToOrderlist.value = true
    }
    fun onQrClicked(){
        _navigateToQr.value = true
    }
    fun onSponsorClicked(){
        _navigateToSponsor.value = true
    }

    fun doneNavigating(){
        _navigateToOrderlist.value = false
        _navigateToQr.value = false
        _navigateToSponsor.value = false
    }
}