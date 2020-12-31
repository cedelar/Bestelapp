package com.example.bestelapp.data.product;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0003\u001a\u0018\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u0001\u001a\u0018\u0010\u000b\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u0001\u001a\u0010\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00060\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"BASE_URL", "", "asDatabaseProduct", "Lcom/example/bestelapp/data/product/DatabaseProduct;", "Lcom/example/bestelapp/data/product/NetworkProduct;", "asModelProduct", "Lcom/example/bestelapp/data/product/ModelProduct;", "decrementByName", "", "", "name", "incrementByName", "isAmountPlaced", "", "app_debug"})
public final class ProductKt {
    private static final java.lang.String BASE_URL = "https://olt-bestelapp.herokuapp.com/";
    
    /**
     * An extension function to increase the amount field of a [ModelProduct] in a [List] by 1
     *
     * @param name The name of the required [ModelProduct]
     * @receiver A [List] of [ModelProduct]s
     */
    public static final void incrementByName(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.bestelapp.data.product.ModelProduct> $this$incrementByName, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    /**
     * An extension function to decrease the amount field of a [ModelProduct] in a [List] by 1
     *
     * @param name The name of the required [ModelProduct]
     * @receiver A [List] of [ModelProduct]s
     */
    public static final void decrementByName(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.bestelapp.data.product.ModelProduct> $this$decrementByName, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    /**
     * An extension function to check if the amount field of at least 1 [ModelProduct] in a [List] is > 0
     *
     * @receiver A [List] of [ModelProduct]s
     * @return A [Boolean]
     */
    public static final boolean isAmountPlaced(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.bestelapp.data.product.ModelProduct> $this$isAmountPlaced) {
        return false;
    }
    
    /**
     * An extension function to convert a [DatabaseProduct] into a [ModelProduct].
     *
     * @receiver A [DatabaseProduct]
     * @return The corresponding [ModelProduct]
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bestelapp.data.product.ModelProduct asModelProduct(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.product.DatabaseProduct $this$asModelProduct) {
        return null;
    }
    
    /**
     * An extension function to convert a [NetworkProduct] into a [DatabaseProduct].
     *
     * @receiver A [NetworkProduct]
     * @return The corresponding [DatabaseProduct]
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bestelapp.data.product.DatabaseProduct asDatabaseProduct(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.product.NetworkProduct $this$asDatabaseProduct) {
        return null;
    }
}