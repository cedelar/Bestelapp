package com.example.bestelapp.data.product;

import java.lang.System;

/**
 * An Entity data class to represent a Product in the database.
 *
 * @property productId The id of the product
 * @property name The name of the product
 * @property price The price of the product
 * @property description The description of the product
 * @property pictureLink The weblink to the picture of the product
 * @property category The category of the product
 * @property available The availability of the product
 * @constructor Creates a [DatabaseProduct].
 * @author Cedric Delaruelle
 */
@androidx.room.Entity(tableName = "product_table", indices = {@androidx.room.Index(unique = true, value = {"product_name"})})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bBK\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0014J\t\u0010 \u001a\u00020\rH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003JO\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\nH\u00c6\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006-"}, d2 = {"Lcom/example/bestelapp/data/product/DatabaseProduct;", "", "name_", "", "price_", "", "description_", "pictureLink_", "category_", "available_", "", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "productId", "", "name", "price", "description", "pictureLink", "category", "available", "(JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAvailable", "()Z", "getCategory", "()Ljava/lang/String;", "getDescription", "getName", "getPictureLink", "getPrice", "()D", "getProductId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class DatabaseProduct {
    @androidx.room.ColumnInfo(name = "product_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long productId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_name")
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "product_price")
    private final double price = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_picturelink")
    private final java.lang.String pictureLink = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_category")
    private final java.lang.String category = null;
    @androidx.room.ColumnInfo(name = "product_availability")
    private final boolean available = false;
    
    public final long getProductId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final double getPrice() {
        return 0.0;
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
    
    public final boolean getAvailable() {
        return false;
    }
    
    public DatabaseProduct(long productId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double price, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String pictureLink, @org.jetbrains.annotations.NotNull()
    java.lang.String category, boolean available) {
        super();
    }
    
    public DatabaseProduct() {
        super();
    }
    
    public DatabaseProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String name_, double price_, @org.jetbrains.annotations.NotNull()
    java.lang.String description_, @org.jetbrains.annotations.NotNull()
    java.lang.String pictureLink_, @org.jetbrains.annotations.NotNull()
    java.lang.String category_, boolean available_) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
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
    
    public final boolean component7() {
        return false;
    }
    
    /**
     * An Entity data class to represent a Product in the database.
     *
     * @property productId The id of the product
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @constructor Creates a [DatabaseProduct].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.product.DatabaseProduct copy(long productId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double price, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String pictureLink, @org.jetbrains.annotations.NotNull()
    java.lang.String category, boolean available) {
        return null;
    }
    
    /**
     * An Entity data class to represent a Product in the database.
     *
     * @property productId The id of the product
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @constructor Creates a [DatabaseProduct].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * An Entity data class to represent a Product in the database.
     *
     * @property productId The id of the product
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @constructor Creates a [DatabaseProduct].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * An Entity data class to represent a Product in the database.
     *
     * @property productId The id of the product
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @constructor Creates a [DatabaseProduct].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}