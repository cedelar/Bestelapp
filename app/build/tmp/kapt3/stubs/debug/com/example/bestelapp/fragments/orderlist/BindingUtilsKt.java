package com.example.bestelapp.fragments.orderlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\n"}, d2 = {"setProductAmount", "", "Landroid/widget/TextView;", "item", "Lcom/example/bestelapp/data/product/ModelProduct;", "setProductDescription", "setProductImage", "Landroid/widget/ImageView;", "setProductName", "setProductPrice", "app_debug"})
public final class BindingUtilsKt {
    
    /**
     * A [BindingAdapter] to set the picture of the displayed Product.
     *
     * @param item The used [ModelProduct]
     * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
     */
    @androidx.databinding.BindingAdapter(value = {"productImage"})
    public static final void setProductImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setProductImage, @org.jetbrains.annotations.Nullable()
    com.example.bestelapp.data.product.ModelProduct item) {
    }
    
    /**
     * A [BindingAdapter] to set the name of the displayed Product.
     *
     * @param item The used [ModelProduct]
     * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
     */
    @androidx.databinding.BindingAdapter(value = {"productName"})
    public static final void setProductName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setProductName, @org.jetbrains.annotations.Nullable()
    com.example.bestelapp.data.product.ModelProduct item) {
    }
    
    /**
     * A [BindingAdapter] to set the price of the displayed Product.
     *
     * @param item The used [ModelProduct]
     * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
     */
    @androidx.databinding.BindingAdapter(value = {"productPrice"})
    public static final void setProductPrice(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setProductPrice, @org.jetbrains.annotations.Nullable()
    com.example.bestelapp.data.product.ModelProduct item) {
    }
    
    /**
     * A [BindingAdapter] to set the description of the displayed Product.
     *
     * @param item The used [ModelProduct]
     * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
     */
    @androidx.databinding.BindingAdapter(value = {"productDescription"})
    public static final void setProductDescription(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setProductDescription, @org.jetbrains.annotations.Nullable()
    com.example.bestelapp.data.product.ModelProduct item) {
    }
    
    /**
     * A [BindingAdapter] to set the amount of the displayed Product.
     *
     * @param item The used [ModelProduct]
     * @see [ModelProduct] [OrderlistFragment] [OrderlistViewModel]
     */
    @androidx.databinding.BindingAdapter(value = {"productAmount"})
    public static final void setProductAmount(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setProductAmount, @org.jetbrains.annotations.Nullable()
    com.example.bestelapp.data.product.ModelProduct item) {
    }
}