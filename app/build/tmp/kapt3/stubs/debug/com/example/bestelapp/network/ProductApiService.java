package com.example.bestelapp.network;

import java.lang.System;

/**
 * An interface detailing API calls to the 'olt-bestelapp.herokuapp.com' server.
 *
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/bestelapp/network/ProductApiService;", "", "getProducts", "Lretrofit2/Call;", "", "Lcom/example/bestelapp/data/product/NetworkProduct;", "sendOrder", "Lcom/example/bestelapp/data/datawrapper/ServerResponse;", "data", "Lcom/example/bestelapp/data/datawrapper/DataWrapper;", "app_debug"})
public abstract interface ProductApiService {
    
    /**
     * Function sending a Get request to the '/artikelen' endpoint of the server.
     *
     * @return A [Call] containing the [List] of [NetworkProduct] that the server send.
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "artikelen")
    public abstract retrofit2.Call<java.util.List<com.example.bestelapp.data.product.NetworkProduct>> getProducts();
    
    /**
     * Function sending a Post request to the '/bestel' endpoint of the server.
     *
     * @param data The [DataWrapper] object to be send to the server
     * @return A [Call] containing the [ServerResponse] that the server send.
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "bestel")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.example.bestelapp.data.datawrapper.ServerResponse> sendOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.bestelapp.data.datawrapper.DataWrapper data);
}