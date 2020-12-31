package com.example.bestelapp.fragments.orderlist;

import java.lang.System;

/**
 * The [AndroidViewModel] class for the [OrderlistFragment]
 *
 * @property table The number of the table to be placing the order
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0011\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020%J\u0006\u0010(\u001a\u00020\u001fJ\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020%J\b\u0010*\u001a\u00020\u001fH\u0002J\u0006\u0010+\u001a\u00020\u001fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u000f\u00a8\u0006,"}, d2 = {"Lcom/example/bestelapp/fragments/orderlist/OrderlistViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "table", "", "application", "Landroid/app/Application;", "(ILandroid/app/Application;)V", "_confirmButtonVisible", "Landroidx/lifecycle/MutableLiveData;", "", "_navigateToConfirmation", "_viewUpdateRequired", "confirmButtonVisible", "Landroidx/lifecycle/LiveData;", "getConfirmButtonVisible", "()Landroidx/lifecycle/LiveData;", "database", "Lcom/example/bestelapp/data/product/ProductDatabase;", "navigateToConfirmation", "getNavigateToConfirmation", "productRepository", "Lcom/example/bestelapp/repository/ProductRepository;", "products", "", "Lcom/example/bestelapp/data/product/ModelProduct;", "getProducts", "getTable", "()I", "viewUpdateRequired", "getViewUpdateRequired", "doneNavigating", "", "getOrders", "", "Lcom/example/bestelapp/data/datawrapper/Order;", "()[Lcom/example/bestelapp/data/datawrapper/Order;", "getTitle", "", "onAddClicked", "productName", "onConfirmClicked", "onSubtractClicked", "updateConfirmButton", "viewUpdateExecuted", "app_debug"})
public final class OrderlistViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.bestelapp.data.product.ProductDatabase database = null;
    private final com.example.bestelapp.repository.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.bestelapp.data.product.ModelProduct>> products = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _viewUpdateRequired;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _confirmButtonVisible;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToConfirmation;
    private final int table = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.bestelapp.data.product.ModelProduct>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getViewUpdateRequired() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getConfirmButtonVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToConfirmation() {
        return null;
    }
    
    /**
     * Function to be called when the 'Add' button is clicked.
     *
     * Increases the amount of the required [ModelProduct] by 1
     *
     * @param productName The name of the required [ModelProduct]
     */
    public final void onAddClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String productName) {
    }
    
    /**
     * Function to be called when the 'Subtract' button is clicked.
     *
     * Decreases the amount of the required [ModelProduct] by 1
     *
     * @param productName The name of the required [ModelProduct]
     */
    public final void onSubtractClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String productName) {
    }
    
    /**
     * Function to be called when the 'Confirm' button is clicked.
     *
     * Triggers navigation
     */
    public final void onConfirmClicked() {
    }
    
    private final void updateConfirmButton() {
    }
    
    /**
     * Function to be called when a requested viewupdate is executed.
     */
    public final void viewUpdateExecuted() {
    }
    
    /**
     * Function to be called when navigation has occurred.
     */
    public final void doneNavigating() {
    }
    
    /**
     * Function to get the placed order as an [Array] of [Order]s.
     *
     * An order is placed in the [Array] for all [ModelProduct]s with amounts > 0
     *
     * @return The requested [Array] of [Order]s
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.datawrapper.Order[] getOrders() {
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
    
    public final int getTable() {
        return 0;
    }
    
    public OrderlistViewModel(int table, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}