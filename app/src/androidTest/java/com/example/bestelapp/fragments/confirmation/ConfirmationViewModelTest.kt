package com.example.bestelapp.fragments.confirmation

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.bestelapp.data.datawrapper.Order
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ConfirmationViewModelTest {
    private lateinit var confirmationViewModel: ConfirmationViewModel

    @Before
    fun setup() {
        val orders = arrayOf(
            Order("Artikel1", 1, 1.0),
            Order("Artikel2", 3, 3.0),
            Order("Artikel3", 1, 15.0),
            Order("Artikel4", 10, 1.0),
            Order("Artikel5", 1, 4.0)
        )
        confirmationViewModel =
            ConfirmationViewModel(orders, 300, 38855, ApplicationProvider.getApplicationContext())
    }

    @Test
    fun testGetTotalPrice() {
        assertEquals(39.0, confirmationViewModel.getTotalPrice(), 0.001)
    }

    @Test
    fun testGetTotalPriceString() {
        val string = "Totaal: 39 Bonnen"
        assertEquals(string, confirmationViewModel.getTotalPriceString())
    }

    @Test
    fun testGetFormattedOrderString() {
        val string = "Artikel1: 1x\nArtikel2: 3x\nArtikel3: 1x\nArtikel4: 10x\nArtikel5: 1x\n"
        assertEquals(string, confirmationViewModel.getFormattedOrderString())
    }

    @Test
    fun testGetTitle() {
        val string = "Uw bestelling: Tafel 300"
        assertEquals(string, confirmationViewModel.getTitle())
    }
}
