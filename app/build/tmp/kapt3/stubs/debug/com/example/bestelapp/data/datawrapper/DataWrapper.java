package com.example.bestelapp.data.datawrapper;

import java.lang.System;

/**
 * Moshi Json convertable data class used as body in Post requests to the server.
 *
 * @property controlNumber The controlnumber of the table
 * @property orders A list of [NetworkOrder]
 * @property tableNumber The number of the table
 * @property price The combined price of the orders
 * @constructor Creates a [DataWrapper].
 * @see NetworkOrder
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/bestelapp/data/datawrapper/DataWrapper;", "", "controlNumber", "", "orders", "", "Lcom/example/bestelapp/data/datawrapper/NetworkOrder;", "tableNumber", "price", "(ILjava/util/List;II)V", "getControlNumber", "()I", "getOrders", "()Ljava/util/List;", "getPrice", "getTableNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class DataWrapper {
    private final int controlNumber = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.bestelapp.data.datawrapper.NetworkOrder> orders = null;
    private final int tableNumber = 0;
    private final int price = 0;
    
    public final int getControlNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.bestelapp.data.datawrapper.NetworkOrder> getOrders() {
        return null;
    }
    
    public final int getTableNumber() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    public DataWrapper(@com.squareup.moshi.Json(name = "controle")
    int controlNumber, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "bestelling")
    java.util.List<com.example.bestelapp.data.datawrapper.NetworkOrder> orders, @com.squareup.moshi.Json(name = "tafel")
    int tableNumber, @com.squareup.moshi.Json(name = "prijs")
    int price) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.bestelapp.data.datawrapper.NetworkOrder> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    /**
     * Moshi Json convertable data class used as body in Post requests to the server.
     *
     * @property controlNumber The controlnumber of the table
     * @property orders A list of [NetworkOrder]
     * @property tableNumber The number of the table
     * @property price The combined price of the orders
     * @constructor Creates a [DataWrapper].
     * @see NetworkOrder
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.datawrapper.DataWrapper copy(@com.squareup.moshi.Json(name = "controle")
    int controlNumber, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "bestelling")
    java.util.List<com.example.bestelapp.data.datawrapper.NetworkOrder> orders, @com.squareup.moshi.Json(name = "tafel")
    int tableNumber, @com.squareup.moshi.Json(name = "prijs")
    int price) {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used as body in Post requests to the server.
     *
     * @property controlNumber The controlnumber of the table
     * @property orders A list of [NetworkOrder]
     * @property tableNumber The number of the table
     * @property price The combined price of the orders
     * @constructor Creates a [DataWrapper].
     * @see NetworkOrder
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used as body in Post requests to the server.
     *
     * @property controlNumber The controlnumber of the table
     * @property orders A list of [NetworkOrder]
     * @property tableNumber The number of the table
     * @property price The combined price of the orders
     * @constructor Creates a [DataWrapper].
     * @see NetworkOrder
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Moshi Json convertable data class used as body in Post requests to the server.
     *
     * @property controlNumber The controlnumber of the table
     * @property orders A list of [NetworkOrder]
     * @property tableNumber The number of the table
     * @property price The combined price of the orders
     * @constructor Creates a [DataWrapper].
     * @see NetworkOrder
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}