package com.example.bestelapp.data.datawrapper;

import java.lang.System;

/**
 * Moshi Json convertable data class used to wrap the orders in Post requests to the server.
 *
 * @property product A [ProductNameWrapper] with the ordered product
 * @property amount The amount of ordered products
 * @property options A list of [String] with the chosen options
 * @constructor Creates a [NetworkOrder].
 * @see ProductNameWrapper
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/bestelapp/data/datawrapper/NetworkOrder;", "", "product", "Lcom/example/bestelapp/data/datawrapper/ProductNameWrapper;", "amount", "", "options", "", "", "(Lcom/example/bestelapp/data/datawrapper/ProductNameWrapper;ILjava/util/List;)V", "getAmount", "()I", "getOptions", "()Ljava/util/List;", "getProduct", "()Lcom/example/bestelapp/data/datawrapper/ProductNameWrapper;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class NetworkOrder {
    @org.jetbrains.annotations.NotNull()
    private final com.example.bestelapp.data.datawrapper.ProductNameWrapper product = null;
    private final int amount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> options = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.datawrapper.ProductNameWrapper getProduct() {
        return null;
    }
    
    public final int getAmount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOptions() {
        return null;
    }
    
    public NetworkOrder(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "artikel")
    com.example.bestelapp.data.datawrapper.ProductNameWrapper product, @com.squareup.moshi.Json(name = "aantal")
    int amount, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "opties")
    java.util.List<java.lang.String> options) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.datawrapper.ProductNameWrapper component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the orders in Post requests to the server.
     *
     * @property product A [ProductNameWrapper] with the ordered product
     * @property amount The amount of ordered products
     * @property options A list of [String] with the chosen options
     * @constructor Creates a [NetworkOrder].
     * @see ProductNameWrapper
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.datawrapper.NetworkOrder copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "artikel")
    com.example.bestelapp.data.datawrapper.ProductNameWrapper product, @com.squareup.moshi.Json(name = "aantal")
    int amount, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "opties")
    java.util.List<java.lang.String> options) {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the orders in Post requests to the server.
     *
     * @property product A [ProductNameWrapper] with the ordered product
     * @property amount The amount of ordered products
     * @property options A list of [String] with the chosen options
     * @constructor Creates a [NetworkOrder].
     * @see ProductNameWrapper
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the orders in Post requests to the server.
     *
     * @property product A [ProductNameWrapper] with the ordered product
     * @property amount The amount of ordered products
     * @property options A list of [String] with the chosen options
     * @constructor Creates a [NetworkOrder].
     * @see ProductNameWrapper
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the orders in Post requests to the server.
     *
     * @property product A [ProductNameWrapper] with the ordered product
     * @property amount The amount of ordered products
     * @property options A list of [String] with the chosen options
     * @constructor Creates a [NetworkOrder].
     * @see ProductNameWrapper
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}