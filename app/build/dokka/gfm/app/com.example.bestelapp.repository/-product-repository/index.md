//[app](../../index.md)/[com.example.bestelapp.repository](../index.md)/[ProductRepository](index.md)



# ProductRepository  
 [androidJvm] class [ProductRepository](index.md)(**database**: [ProductDatabase](../../com.example.bestelapp.data.product/-product-database/index.md))

A repository class containing cashed Product data.

   


## See also  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.repository/ProductRepository///PointingToDeclaration/"></a>[com.example.bestelapp.network.ProductApi](../../com.example.bestelapp.network/-product-api/index.md)| <a name="com.example.bestelapp.repository/ProductRepository///PointingToDeclaration/"></a>
  


## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.repository/ProductRepository///PointingToDeclaration/"></a>database| <a name="com.example.bestelapp.repository/ProductRepository///PointingToDeclaration/"></a><br><br>The [ProductDatabase](../../com.example.bestelapp.data.product/-product-database/index.md) containing the [DatabaseProduct](../../com.example.bestelapp.data.product/-database-product/index.md)s<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.repository/ProductRepository/ProductRepository/#com.example.bestelapp.data.product.ProductDatabase/PointingToDeclaration/"></a>[ProductRepository](-product-repository.md)| <a name="com.example.bestelapp.repository/ProductRepository/ProductRepository/#com.example.bestelapp.data.product.ProductDatabase/PointingToDeclaration/"></a> [androidJvm] fun [ProductRepository](-product-repository.md)(database: [ProductDatabase](../../com.example.bestelapp.data.product/-product-database/index.md))The [ProductDatabase](../../com.example.bestelapp.data.product/-product-database/index.md) containing the [DatabaseProduct](../../com.example.bestelapp.data.product/-database-product/index.md)s   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.example.bestelapp.repository/ProductRepository/refreshProducts/#/PointingToDeclaration/"></a>[refreshProducts](refresh-products.md)| <a name="com.example.bestelapp.repository/ProductRepository/refreshProducts/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>suspend fun [refreshProducts](refresh-products.md)()  <br>More info  <br>A function to refresh the contents of the cashe from the server.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.repository/ProductRepository/products/#/PointingToDeclaration/"></a>[products](products.md)| <a name="com.example.bestelapp.repository/ProductRepository/products/#/PointingToDeclaration/"></a> [androidJvm] val [products](products.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ModelProduct](../../com.example.bestelapp.data.product/-model-product/index.md)>>   <br>

