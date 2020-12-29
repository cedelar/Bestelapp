package com.example.bestelapp.fragments.qr

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.bestelapp.data.qr.Qr
import com.example.bestelapp.data.qr.QrDatabaseDao
import com.google.zxing.BarcodeFormat
import com.google.zxing.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private const val BASE_URL = "https://olt-bestelapp.herokuapp.com/html/tafel.html?"

class QrViewModel(val database: QrDatabaseDao,
    application: Application) : AndroidViewModel(application)  {

    private var _navigateToTitle = MutableLiveData<Boolean>()
    val navigateToTitle: LiveData<Boolean>
        get() = _navigateToTitle

    private var _tableNumber = MutableLiveData<Int>()
    val tableNumber: LiveData<Int>
        get() = _tableNumber

    private var _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String>
        get() = _errorMessage

    fun onBackClicked(){
        _navigateToTitle.value = true
    }

    fun doneNavigating(){
        _navigateToTitle.value = false
    }

    fun handleQrScannerResult(result: Result){
        if(result.barcodeFormat == BarcodeFormat.QR_CODE){
            val code = result.text.substring(BASE_URL.length).split("&")
            _tableNumber.value = code[0].substring(3).toInt()
            val controlNumber = code[1].substring(3).toInt()
            viewModelScope.launch {
                clear()
                insert(Qr(_tableNumber.value!!, controlNumber))
            }
        }else{
            _errorMessage.value = "This isn't a QR-Code. Try again!"
        }
    }

    private suspend fun clear(){
        withContext(Dispatchers.IO){
            database.clear()
        }
    }

    private suspend fun insert(qr: Qr) {
        withContext(Dispatchers.IO) {
            database.insert(qr)
        }
    }
}