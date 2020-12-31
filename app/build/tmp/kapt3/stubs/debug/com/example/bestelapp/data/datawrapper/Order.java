package com.example.bestelapp.data.datawrapper;

import java.lang.System;

/**
 * A parcelable class to pass orders between fragments.
 *
 * @property productName The name of the product
 * @property productAmount The amount of the product
 * @property price The price of a single product
 * @constructor Creates an [Order].
 * @see Parcelable
 * @author Cedric Delaruelle
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/example/bestelapp/data/datawrapper/Order;", "Landroid/os/Parcelable;", "productName", "", "productAmount", "", "price", "", "(Ljava/lang/String;ID)V", "getPrice", "()D", "setPrice", "(D)V", "getProductAmount", "()I", "setProductAmount", "(I)V", "getProductName", "()Ljava/lang/String;", "setProductName", "(Ljava/lang/String;)V", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Order implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String productName;
    private int productAmount;
    private double price;
    public static final android.os.Parcelable.Creator<com.example.bestelapp.data.datawrapper.Order> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getProductAmount() {
        return 0;
    }
    
    public final void setProductAmount(int p0) {
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final void setPrice(double p0) {
    }
    
    public Order(@org.jetbrains.annotations.NotNull()
    java.lang.String productName, int productAmount, double price) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.bestelapp.data.datawrapper.Order> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.bestelapp.data.datawrapper.Order[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.bestelapp.data.datawrapper.Order createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}