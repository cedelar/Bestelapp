//[app](../../index.md)/[com.example.bestelapp.data.product](../index.md)/[ProductDatabaseDao](index.md)



# ProductDatabaseDao  
 [androidJvm] interface [ProductDatabaseDao](index.md)

An Interface that defines the [Dao](https://developer.android.com/reference/kotlin/androidx/room/Dao.html) for the [ProductDatabase](../-product-database/index.md)



#### Author  


Cedric Delaruelle

   


## See also  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.product/ProductDatabaseDao///PointingToDeclaration/"></a>[androidx.room.RoomDatabase](https://developer.android.com/reference/kotlin/androidx/room/RoomDatabase.html)| <a name="com.example.bestelapp.data.product/ProductDatabaseDao///PointingToDeclaration/"></a><br><br>[DatabaseProduct](../-database-product/index.md)<br><br>
  


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/clear/#/PointingToDeclaration/"></a>[clear](clear.md)| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/clear/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [clear](clear.md)()  <br>More info  <br>Function used to clear all [DatabaseProduct](../-database-product/index.md)s.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1024765483)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1024765483)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/get/#kotlin.Long/PointingToDeclaration/"></a>[get](get.md)| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/get/#kotlin.Long/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [get](get.md)(key: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [DatabaseProduct](../-database-product/index.md)?  <br>More info  <br>Function used to get a specific [DatabaseProduct](../-database-product/index.md) from the database.  <br><br><br>
| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/getAllProducts/#/PointingToDeclaration/"></a>[getAllProducts](get-all-products.md)| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/getAllProducts/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [getAllProducts](get-all-products.md)(): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[DatabaseProduct](../-database-product/index.md)>>  <br>More info  <br>Function used to get all [DatabaseProduct](../-database-product/index.md)s from the database.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1024765483)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1024765483)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/insert/#com.example.bestelapp.data.product.DatabaseProduct/PointingToDeclaration/"></a>[insert](insert.md)| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/insert/#com.example.bestelapp.data.product.DatabaseProduct/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [insert](insert.md)(databaseProduct: [DatabaseProduct](../-database-product/index.md))  <br>More info  <br>Function used to insert a [DatabaseProduct](../-database-product/index.md) into the database.  <br><br><br>
| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/insertAll/#kotlin.Array[com.example.bestelapp.data.product.DatabaseProduct]/PointingToDeclaration/"></a>[insertAll](insert-all.md)| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/insertAll/#kotlin.Array[com.example.bestelapp.data.product.DatabaseProduct]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [insertAll](insert-all.md)(vararg databaseProducts: [DatabaseProduct](../-database-product/index.md))  <br>More info  <br>Function used to insert multiple [DatabaseProduct](../-database-product/index.md)s into the database at once.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1024765483)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1024765483)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/update/#com.example.bestelapp.data.product.DatabaseProduct/PointingToDeclaration/"></a>[update](update.md)| <a name="com.example.bestelapp.data.product/ProductDatabaseDao/update/#com.example.bestelapp.data.product.DatabaseProduct/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [update](update.md)(databaseProduct: [DatabaseProduct](../-database-product/index.md))  <br>More info  <br>Function used to update a [DatabaseProduct](../-database-product/index.md) in the database.  <br><br><br>

