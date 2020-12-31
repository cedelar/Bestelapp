package com.example.bestelapp.fragments.orderlist;

import java.lang.System;

/**
 * A class for specifying what to do when specific buttons are clicked.
 *
 * @param clickUpListener A function to be executed when 'Up' is clicked
 * @param clickDownListener A function to be executed when 'Down' is clicked
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010R,\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/bestelapp/fragments/orderlist/ProductItemListener;", "", "clickUpListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "productName", "", "clickDownListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getClickDownListener", "()Lkotlin/jvm/functions/Function1;", "getClickUpListener", "onDownClick", "modelProduct", "Lcom/example/bestelapp/data/product/ModelProduct;", "onUpClick", "app_debug"})
public final class ProductItemListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> clickUpListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> clickDownListener = null;
    
    /**
     * Function to be called when the 'Up' button is clicked.
     *
     * Executes the clickUpListener function specified on class creation
     */
    public final void onUpClick(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.product.ModelProduct modelProduct) {
    }
    
    /**
     * Function to be called when the 'Down' button is clicked.
     *
     * Executes the clickDownListener function specified on class creation
     */
    public final void onDownClick(@org.jetbrains.annotations.NotNull()
    com.example.bestelapp.data.product.ModelProduct modelProduct) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getClickUpListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getClickDownListener() {
        return null;
    }
    
    public ProductItemListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> clickUpListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> clickDownListener) {
        super();
    }
}