//[app](../../index.md)/[com.example.bestelapp.network](../index.md)/[ProductApiService](index.md)



# ProductApiService  
 [androidJvm] interface [ProductApiService](index.md)

An interface detailing API calls to the 'olt-bestelapp.herokuapp.com' server.



#### Author  


Cedric Delaruelle

   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.example.bestelapp.network/ProductApiService/getProducts/#/PointingToDeclaration/"></a>[getProducts](get-products.md)| <a name="com.example.bestelapp.network/ProductApiService/getProducts/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@GET(value = "artikelen")  <br>  <br>abstract fun [getProducts](get-products.md)(): Call<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[NetworkProduct](../../com.example.bestelapp.data.product/-network-product/index.md)>>  <br>More info  <br>Function sending a Get request to the '/artikelen' endpoint of the server.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.example.bestelapp.network/ProductApiService/sendOrder/#com.example.bestelapp.data.datawrapper.DataWrapper/PointingToDeclaration/"></a>[sendOrder](send-order.md)| <a name="com.example.bestelapp.network/ProductApiService/sendOrder/#com.example.bestelapp.data.datawrapper.DataWrapper/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Headers(value = ["Content-Type: application/json"])  <br>@POST(value = "bestel")  <br>  <br>abstract fun [sendOrder](send-order.md)(@Body()data: [DataWrapper](../../com.example.bestelapp.data.datawrapper/-data-wrapper/index.md)): Call<[ServerResponse](../../com.example.bestelapp.data.datawrapper/-server-response/index.md)>  <br>More info  <br>Function sending a Post request to the '/bestel' endpoint of the server.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

