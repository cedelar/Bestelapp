package com.example.bestelapp.data.product;

import java.lang.System;

/**
 * Moshi Json convertable data class to represent a Product in an API call.
 *
 * @property name The name of the product
 * @property price The price of the product
 * @property description The description of the product
 * @property pictureLink The weblink to the picture of the product
 * @property category The category of the product
 * @property available The availability of the product
 * @constructor Creates a [NetworkProduct].
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/example/bestelapp/data/product/NetworkProduct;", "", "name", "", "price", "", "description", "pictureLink", "category", "available", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvailable", "()Ljava/lang/String;", "getCategory", "getDescription", "getName", "getPictureLink", "getPrice", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class NetworkProduct {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int price = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pictureLink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String category = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String available = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPictureLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvailable() {
        return null;
    }
    
    public NetworkProduct(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "naam")
    java.lang.String name, @com.squareup.moshi.Json(name = "prijs")
    int price, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "beschrijving")
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String pictureLink, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "categorie")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "beschikbaar")
    java.lang.String available) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class to represent a Product in an API call.
     *
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @constructor Creates a [NetworkProduct].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.product.NetworkProduct copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "naam")
    java.lang.String name, @com.squareup.moshi.Json(name = "prijs")
    int price, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "beschrijving")
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String pictureLink, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "categorie")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "beschikbaar")
    java.lang.String available) {
        return null;
    }
    
    /**
     * Moshi Json convertable data class to represent a Product in an API call.
     *
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @constructor Creates a [NetworkProduct].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class to represent a Product in an API call.
     *
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @constructor Creates a [NetworkProduct].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Moshi Json convertable data class to represent a Product in an API call.
     *
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @constructor Creates a [NetworkProduct].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}