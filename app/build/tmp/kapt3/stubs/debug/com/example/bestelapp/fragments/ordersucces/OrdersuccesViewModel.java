package com.example.bestelapp.fragments.ordersucces;

import java.lang.System;

/**
 * The [AndroidViewModel] class for the [OrdersuccesFragment]
 *
 * @property message The message to be displayed
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\tH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/example/bestelapp/fragments/ordersucces/OrdersuccesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "message", "", "application", "Landroid/app/Application;", "(Ljava/lang/String;Landroid/app/Application;)V", "_navigateToTitle", "Landroidx/lifecycle/MutableLiveData;", "", "navigateToTitle", "Landroidx/lifecycle/LiveData;", "getNavigateToTitle", "()Landroidx/lifecycle/LiveData;", "doneNavigating", "", "getInfoMessage", "getTitle", "onBackClicked", "statusOk", "app_debug"})
public final class OrdersuccesViewModel extends androidx.lifecycle.AndroidViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToTitle;
    private final java.lang.String message = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToTitle() {
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
    
    private final boolean statusOk() {
        return false;
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
    
    /**
     * Function to build the string with the infomessage to be displayed.
     *
     * @return The requested [String]
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInfoMessage() {
        return null;
    }
    
    public OrdersuccesViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}