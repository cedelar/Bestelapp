package com.example.bestelapp.data.product;

import java.lang.System;

/**
 * A data class to represent a Product in the app
 *
 * @property productId The id of the product
 * @property name The name of the product
 * @property price The price of the product
 * @property description The description of the product
 * @property pictureLink The weblink to the picture of the product
 * @property category The category of the product
 * @property available The availability of the product
 * @property amount The currently displayed, ordered amount
 * @constructor Creates a [ModelProduct].
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rBG\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\u0016H\u00c6\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u00c6\u0001J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0016H\u00d6\u0001J\u0006\u00105\u001a\u000201J\t\u00106\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u00067"}, d2 = {"Lcom/example/bestelapp/data/product/ModelProduct;", "", "productId_", "", "name_", "", "price_", "", "description_", "pictureLink_", "category_", "available_", "", "(JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "productId", "name", "price", "description", "pictureLink", "category", "available", "amount", "", "(JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getAmount", "()I", "setAmount", "(I)V", "getAvailable", "()Z", "getCategory", "()Ljava/lang/String;", "getDescription", "getName", "getPictureLink", "getPrice", "()D", "getProductId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "decrement", "", "equals", "other", "hashCode", "increment", "toString", "app_debug"})
public final class ModelProduct {
    private final long productId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final double price = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pictureLink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String category = null;
    private final boolean available = false;
    private int amount;
    
    /**
     * A function to increase the amount field of the [ModelProduct] by 1
     */
    public final void increment() {
    }
    
    /**
     * A function to decrease the amount field of the [ModelProduct] by 1
     */
    public final void decrement() {
    }
    
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
    
    public final int getAmount() {
        return 0;
    }
    
    public final void setAmount(int p0) {
    }
    
    public ModelProduct(long productId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double price, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String pictureLink, @org.jetbrains.annotations.NotNull()
    java.lang.String category, boolean available, int amount) {
        super();
    }
    
    public ModelProduct(long productId_, @org.jetbrains.annotations.NotNull()
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
    
    public final int component8() {
        return 0;
    }
    
    /**
     * A data class to represent a Product in the app
     *
     * @property productId The id of the product
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @property amount The currently displayed, ordered amount
     * @constructor Creates a [ModelProduct].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.product.ModelProduct copy(long productId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double price, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String pictureLink, @org.jetbrains.annotations.NotNull()
    java.lang.String category, boolean available, int amount) {
        return null;
    }
    
    /**
     * A data class to represent a Product in the app
     *
     * @property productId The id of the product
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @property amount The currently displayed, ordered amount
     * @constructor Creates a [ModelProduct].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A data class to represent a Product in the app
     *
     * @property productId The id of the product
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @property amount The currently displayed, ordered amount
     * @constructor Creates a [ModelProduct].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A data class to represent a Product in the app
     *
     * @property productId The id of the product
     * @property name The name of the product
     * @property price The price of the product
     * @property description The description of the product
     * @property pictureLink The weblink to the picture of the product
     * @property category The category of the product
     * @property available The availability of the product
     * @property amount The currently displayed, ordered amount
     * @constructor Creates a [ModelProduct].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}