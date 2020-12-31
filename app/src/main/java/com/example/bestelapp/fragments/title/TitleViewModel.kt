package com.example.bestelapp.fragments.title

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.bestelapp.data.qr.QrDatabaseDao

/**
 * The [AndroidViewModel] class for the [TitleFragment]
 *
 * @property database A reference to the [QrDatabaseDao] to be used
 * @author Cedric Delaruelle
 */
class TitleViewModel(val database: QrDatabaseDao, application: Application) :
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
    /**
     * Function to be called when the 'Order' button is clicked.
     *
     * Triggers navigation
     */
    fun onOrderClicked() {
        _navigateToOrderlist.value = true
    }

    /**
     * Function to be called when the 'Qr' button is clicked.
     *
     * Triggers navigation
     */
    fun onQrClicked() {
        _navigateToQr.value = true
    }

    /**
     * Function to be called when the 'Sponsor' button is clicked.
     *
     * Triggers navigation
     */
    fun onSponsorClicked() {
        _navigateToSponsor.value = true
    }

    // Livedataupdaters
    /**
     * Function to be called when navigation has occurred.
     */
    fun doneNavigating() {
        _navigateToOrderlist.value = false
        _navigateToQr.value = false
        _navigateToSponsor.value = false
    }

    // Processing
    /**
     * Function to build the string to be displayed in the actionbar.
     *
     * @return The [String] with the title
     */
    fun getTitle(): String {
        return "OLT Bestelapp"
    }
}
