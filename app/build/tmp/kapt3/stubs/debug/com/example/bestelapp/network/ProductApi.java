package com.example.bestelapp.network;

import java.lang.System;

/**
 * An object with the purpose of returning a [ProductApiService] with a Moshi Json parser set to
 * the 'olt-bestelapp.herokuapp.com' server.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/bestelapp/network/ProductApi;", "", "()V", "retrofitService", "Lcom/example/bestelapp/network/ProductApiService;", "getRetrofitService", "()Lcom/example/bestelapp/network/ProductApiService;", "retrofitService$delegate", "Lkotlin/Lazy;", "app_debug"})
public final class ProductApi {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy retrofitService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bestelapp.network.ProductApi INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.network.ProductApiService getRetrofitService() {
        return null;
    }
    
    private ProductApi() {
        super();
    }
}