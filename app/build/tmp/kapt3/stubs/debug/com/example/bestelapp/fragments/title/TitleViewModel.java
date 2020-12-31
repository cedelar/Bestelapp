package com.example.bestelapp.fragments.title;

import java.lang.System;

/**
 * The [AndroidViewModel] class for the [TitleFragment]
 *
 * @property database A reference to the [QrDatabaseDao] to be used
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u001cR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/example/bestelapp/fragments/title/TitleViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/bestelapp/data/qr/QrDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/bestelapp/data/qr/QrDatabaseDao;Landroid/app/Application;)V", "_navigateToOrderlist", "Landroidx/lifecycle/MutableLiveData;", "", "_navigateToQr", "_navigateToSponsor", "getDatabase", "()Lcom/example/bestelapp/data/qr/QrDatabaseDao;", "navigateToOrderlist", "Landroidx/lifecycle/LiveData;", "getNavigateToOrderlist", "()Landroidx/lifecycle/LiveData;", "navigateToQr", "getNavigateToQr", "navigateToSponsor", "getNavigateToSponsor", "orderButtonVisible", "getOrderButtonVisible", "qrInDatabase", "Lcom/example/bestelapp/data/qr/Qr;", "getQrInDatabase", "doneNavigating", "", "getTitle", "", "onOrderClicked", "onQrClicked", "onSponsorClicked", "app_debug"})
public final class TitleViewModel extends androidx.lifecycle.AndroidViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToOrderlist;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToQr;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToSponsor;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.bestelapp.data.qr.Qr> qrInDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> orderButtonVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.bestelapp.data.qr.QrDatabaseDao database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToOrderlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToQr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToSponsor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.bestelapp.data.qr.Qr> getQrInDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getOrderButtonVisible() {
        return null;
    }
    
    /**
     * Function to be called when the 'Order' button is clicked.
     *
     * Triggers navigation
     */
    public final void onOrderClicked() {
    }
    
    /**
     * Function to be called when the 'Qr' button is clicked.
     *
     * Triggers navigation
     */
    public final void onQrClicked() {
    }
    
    /**
     * Function to be called when the 'Sponsor' button is clicked.
     *
     * Triggers navigation
     */
    public final void onSponsorClicked() {
    }
    
    /**
     * Function to be called when navigation has occurred.
     */
    public final void doneNavigating() {
    }
    
    /**
     * Function to build the string to be displayed in the actionbar.
     *
     * @return The [String] with the title
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.qr.QrDatabaseDao getDatabase() {
        return null;
    }
    
    public TitleViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.qr.QrDatabaseDao database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}