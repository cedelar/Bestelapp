//[app](../../index.md)/[com.example.bestelapp.data.qr](../index.md)/[QrDatabaseDao](index.md)



# QrDatabaseDao  
 [androidJvm] interface [QrDatabaseDao](index.md)

An Interface that defines the [Dao](https://developer.android.com/reference/kotlin/androidx/room/Dao.html) for the [QrDatabase](../-qr-database/index.md)



#### Author  


Cedric Delaruelle

   


## See also  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.qr/QrDatabaseDao///PointingToDeclaration/"></a>[androidx.room.RoomDatabase](https://developer.android.com/reference/kotlin/androidx/room/RoomDatabase.html)| <a name="com.example.bestelapp.data.qr/QrDatabaseDao///PointingToDeclaration/"></a><br><br>[Qr](../-qr/index.md)<br><br>
  


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.data.qr/QrDatabaseDao/clear/#/PointingToDeclaration/"></a>[clear](clear.md)| <a name="com.example.bestelapp.data.qr/QrDatabaseDao/clear/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [clear](clear.md)()  <br>More info  <br>Function used to clear all [Qr](../-qr/index.md)s.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.example.bestelapp.data.qr/QrDatabaseDao/getQr/#/PointingToDeclaration/"></a>[getQr](get-qr.md)| <a name="com.example.bestelapp.data.qr/QrDatabaseDao/getQr/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [getQr](get-qr.md)(): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)<[Qr](../-qr/index.md)>  <br>More info  <br>Function used to get the saved [Qr](../-qr/index.md) from the database.  <br><br><br>
| <a name="com.example.bestelapp.data.qr/QrDatabaseDao/getQrCount/#/PointingToDeclaration/"></a>[getQrCount](get-qr-count.md)| <a name="com.example.bestelapp.data.qr/QrDatabaseDao/getQrCount/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [getQrCount](get-qr-count.md)(): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)<[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)>  <br>More info  <br>Function used to get the amount of saved [Qr](../-qr/index.md) in the database.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.example.bestelapp.data.qr/QrDatabaseDao/insert/#com.example.bestelapp.data.qr.Qr/PointingToDeclaration/"></a>[insert](insert.md)| <a name="com.example.bestelapp.data.qr/QrDatabaseDao/insert/#com.example.bestelapp.data.qr.Qr/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [insert](insert.md)(qr: [Qr](../-qr/index.md))  <br>More info  <br>Function used to insert a [Qr](../-qr/index.md) into the database.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.example.bestelapp.repository/-product-repository/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1760135448)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

