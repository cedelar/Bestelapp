//[app](../../index.md)/[com.example.bestelapp.data.datawrapper](../index.md)/[NetworkOrder](index.md)



# NetworkOrder  
 [androidJvm] @JsonClass(generateAdapter = true)  
  
data class [NetworkOrder](index.md)(@Json(name = "artikel")**product**: [ProductNameWrapper](../-product-name-wrapper/index.md), @Json(name = "aantal")**amount**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @Json(name = "opties")**options**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)

Moshi Json convertable data class used to wrap the orders in Post requests to the server.



#### Author  


Cedric Delaruelle

   


## See also  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder///PointingToDeclaration/"></a>[com.example.bestelapp.data.datawrapper.ProductNameWrapper](../-product-name-wrapper/index.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder///PointingToDeclaration/"></a>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/NetworkOrder/#com.example.bestelapp.data.datawrapper.ProductNameWrapper#kotlin.Int#kotlin.collections.List[kotlin.String]/PointingToDeclaration/"></a>[NetworkOrder](-network-order.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/NetworkOrder/#com.example.bestelapp.data.datawrapper.ProductNameWrapper#kotlin.Int#kotlin.collections.List[kotlin.String]/PointingToDeclaration/"></a> [androidJvm] fun [NetworkOrder](-network-order.md)(@Json(name = "artikel")product: [ProductNameWrapper](../-product-name-wrapper/index.md), @Json(name = "aantal")amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @Json(name = "opties")options: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)Creates a [NetworkOrder](index.md).   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/component1/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component1](component1.md)(): [ProductNameWrapper](../-product-name-wrapper/index.md)  <br><br><br>
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/component2/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component2](component2.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/component3/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component3](component3.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/copy/#com.example.bestelapp.data.datawrapper.ProductNameWrapper#kotlin.Int#kotlin.collections.List[kotlin.String]/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/copy/#com.example.bestelapp.data.datawrapper.ProductNameWrapper#kotlin.Int#kotlin.collections.List[kotlin.String]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [copy](copy.md)(@Json(name = "artikel")product: [ProductNameWrapper](../-product-name-wrapper/index.md), @Json(name = "aantal")amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @Json(name = "opties")options: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>): [NetworkOrder](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/amount/#/PointingToDeclaration/"></a>[amount](amount.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/amount/#/PointingToDeclaration/"></a> [androidJvm] val [amount](amount.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The amount of ordered products   <br>
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/options/#/PointingToDeclaration/"></a>[options](options.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/options/#/PointingToDeclaration/"></a> [androidJvm] val [options](options.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>A list of [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) with the chosen options   <br>
| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/product/#/PointingToDeclaration/"></a>[product](product.md)| <a name="com.example.bestelapp.data.datawrapper/NetworkOrder/product/#/PointingToDeclaration/"></a> [androidJvm] val [product](product.md): [ProductNameWrapper](../-product-name-wrapper/index.md)A [ProductNameWrapper](../-product-name-wrapper/index.md) with the ordered product   <br>

