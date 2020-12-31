//[app](../../index.md)/[com.example.bestelapp.data.datawrapper](../index.md)/[ServerResponse](index.md)



# ServerResponse  
 [androidJvm] @JsonClass(generateAdapter = true)  
  
data class [ServerResponse](index.md)(@Json(name = "status")**status**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), @Json(name = "reason")**reason**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Moshi Json convertable data class used to wrap the response from a Post requests from the server.



#### Author  


Cedric Delaruelle

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/ServerResponse/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[ServerResponse](-server-response.md)| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/ServerResponse/#kotlin.String#kotlin.String/PointingToDeclaration/"></a> [androidJvm] fun [ServerResponse](-server-response.md)(@Json(name = "status")status: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), @Json(name = "reason")reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))Creates a [ServerResponse](index.md).   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/component1/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/component2/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/copy/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/copy/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [copy](copy.md)(@Json(name = "status")status: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), @Json(name = "reason")reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [ServerResponse](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/reason/#/PointingToDeclaration/"></a>[reason](reason.md)| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/reason/#/PointingToDeclaration/"></a> [androidJvm] val [reason](reason.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)If status "NOK": A [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) with the reason for the failed order   <br>
| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/status/#/PointingToDeclaration/"></a>[status](status.md)| <a name="com.example.bestelapp.data.datawrapper/ServerResponse/status/#/PointingToDeclaration/"></a> [androidJvm] val [status](status.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)A [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) with the return status ("OK" or "NOK")   <br>

