//[app](../../index.md)/[com.example.bestelapp.network](../index.md)/[ProductApiService](index.md)/[getProducts](get-products.md)



# getProducts  
[androidJvm]  
Content  
@GET(value = "artikelen")  
  
abstract fun [getProducts](get-products.md)(): Call<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[NetworkProduct](../../com.example.bestelapp.data.product/-network-product/index.md)>>  
More info  


Function sending a Get request to the '/artikelen' endpoint of the server.



#### Return  


A Call containing the [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [NetworkProduct](../../com.example.bestelapp.data.product/-network-product/index.md) that the server send.

  



