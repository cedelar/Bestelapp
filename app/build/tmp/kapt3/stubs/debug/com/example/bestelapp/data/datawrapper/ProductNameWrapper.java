package com.example.bestelapp.data.datawrapper;

import java.lang.System;

/**
 * Moshi Json convertable data class used to wrap the productdetails in Post requests to the server.
 *
 * @property name A [String] with the name of the product
 * @constructor Creates a [ProductNameWrapper].
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/bestelapp/data/datawrapper/ProductNameWrapper;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ProductNameWrapper {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public ProductNameWrapper(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "naam")
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the productdetails in Post requests to the server.
     *
     * @property name A [String] with the name of the product
     * @constructor Creates a [ProductNameWrapper].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.datawrapper.ProductNameWrapper copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "naam")
    java.lang.String name) {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the productdetails in Post requests to the server.
     *
     * @property name A [String] with the name of the product
     * @constructor Creates a [ProductNameWrapper].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the productdetails in Post requests to the server.
     *
     * @property name A [String] with the name of the product
     * @constructor Creates a [ProductNameWrapper].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the productdetails in Post requests to the server.
     *
     * @property name A [String] with the name of the product
     * @constructor Creates a [ProductNameWrapper].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}