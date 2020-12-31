package com.example.bestelapp.fragments.qr;

import java.lang.System;

/**
 * The [AndroidViewModel] class for the [QrFragment]
 *
 * @property database A reference to the [QrDatabaseDao] to be used
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0016\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0019\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/example/bestelapp/fragments/qr/QrViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/bestelapp/data/qr/QrDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/bestelapp/data/qr/QrDatabaseDao;Landroid/app/Application;)V", "_errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "_navigateToTitle", "", "_tableNumber", "", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "navigateToTitle", "getNavigateToTitle", "tableNumber", "getTableNumber", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doneNavigating", "getTitle", "handleQrScannerResult", "result", "Lcom/google/zxing/Result;", "insert", "qr", "Lcom/example/bestelapp/data/qr/Qr;", "(Lcom/example/bestelapp/data/qr/Qr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBackClicked", "app_debug"})
public final class QrViewModel extends androidx.lifecycle.AndroidViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToTitle;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _tableNumber;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage;
    private final com.example.bestelapp.data.qr.QrDatabaseDao database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTableNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    /**
     * Function to be called when the 'Back' button is clicked.
     *
     * Triggers navigation
     */
    public final void onBackClicked() {
    }
    
    /**
     * Function to be called when navigation has occurred.
     */
    public final void doneNavigating() {
    }
    
    /**
     * Function to use the [Result] from the Qr scanner and save it as [Qr] to the [QrDatabase]
     *
     * @param result The [Result] from the scanner
     * @see [QrDatabaseDao]
     */
    public final void handleQrScannerResult(@org.jetbrains.annotations.NotNull()
    com.google.zxing.Result result) {
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
    
    public QrViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.qr.QrDatabaseDao database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}