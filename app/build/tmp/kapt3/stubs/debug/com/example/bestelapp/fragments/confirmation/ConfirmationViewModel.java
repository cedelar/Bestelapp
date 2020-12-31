package com.example.bestelapp.fragments.confirmation;

import java.lang.System;

/**
 * The [AndroidViewModel] class for the [ConfirmationFragment]
 *
 * @property orderArray The [Array] of [Order]s to be confirmed
 * @property table The number of the table to be confirming the order
 * @property control The controlnumber corresponding to the tablenumber
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\rJ\u0006\u0010\u001c\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\rJ\u0006\u0010 \u001a\u00020\u001aJ\b\u0010!\u001a\u00020\u001aH\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/example/bestelapp/fragments/confirmation/ConfirmationViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "orderArray", "", "Lcom/example/bestelapp/data/datawrapper/Order;", "table", "", "control", "application", "Landroid/app/Application;", "([Lcom/example/bestelapp/data/datawrapper/Order;IILandroid/app/Application;)V", "_navigateToSuccesMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getControl", "()I", "navigateToSuccesMessage", "Landroidx/lifecycle/LiveData;", "getNavigateToSuccesMessage", "()Landroidx/lifecycle/LiveData;", "[Lcom/example/bestelapp/data/datawrapper/Order;", "orders", "getOrders", "()[Lcom/example/bestelapp/data/datawrapper/Order;", "getTable", "doneNavigating", "", "getFormattedOrderString", "getTitle", "getTotalPrice", "", "getTotalPriceString", "onNextClicked", "sendOrderToServer", "app_debug"})
public final class ConfirmationViewModel extends androidx.lifecycle.AndroidViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.String> _navigateToSuccesMessage;
    private final com.example.bestelapp.data.datawrapper.Order[] orderArray = null;
    private final int table = 0;
    private final int control = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNavigateToSuccesMessage() {
        return null;
    }
    
    private final com.example.bestelapp.data.datawrapper.Order[] getOrders() {
        return null;
    }
    
    /**
     * Function to be called when the 'Next' button is clicked. Sends the confirmed order to the server via Post request.
     *
     * Updates the navigateToSuccesMessage [LiveData] correspondingly depending on succes/failure of the Post request
     * and triggers navigation.
     *
     * @see [DataWrapper] [ProductApi] [ServerResponse]
     */
    public final void onNextClicked() {
    }
    
    /**
     * Function to be called when navigation has occurred.
     */
    public final void doneNavigating() {
    }
    
    /**
     * Function to calculate the total price of the [Order]s
     *
     * @return The calculated total
     */
    public final double getTotalPrice() {
        return 0.0;
    }
    
    /**
     * Function to build the string with orders to be displayed.
     *
     * @return The [String] with orders
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedOrderString() {
        return null;
    }
    
    /**
     * Function to build the string with the total price to be displayed.
     *
     * @return The [String] with the total price
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalPriceString() {
        return null;
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
    
    private final void sendOrderToServer() {
    }
    
    public final int getTable() {
        return 0;
    }
    
    public final int getControl() {
        return 0;
    }
    
    public ConfirmationViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.datawrapper.Order[] orderArray, int table, int control, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}