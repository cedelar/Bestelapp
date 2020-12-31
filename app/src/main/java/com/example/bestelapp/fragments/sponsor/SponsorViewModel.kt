package com.example.bestelapp.fragments.sponsor

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * The [AndroidViewModel] class for the [SponsorFragment]
 *
 * @author Cedric Delaruelle
 */
class SponsorViewModel(application: Application) : AndroidViewModel(application) {

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

    // Processing
    /**
     * Function to build the string to be displayed in the actionbar.
     *
     * @return The [String] with the title
     */
    fun getTitle(): String {
        return "Onze Sponsors"
    }
}
