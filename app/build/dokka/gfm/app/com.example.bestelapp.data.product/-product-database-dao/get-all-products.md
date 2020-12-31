//[app](../../index.md)/[com.example.bestelapp.data.product](../index.md)/[ProductDatabaseDao](index.md)/[getAllProducts](get-all-products.md)



# getAllProducts  
[androidJvm]  
Content  
abstract fun [getAllProducts](get-all-products.md)(): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[DatabaseProduct](../-database-product/index.md)>>  
More info  


Function used to get all [DatabaseProduct](../-database-product/index.md)s from the database.



#### Return  


A [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html) with a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of all [DatabaseProduct](../-database-product/index.md)s in the database, ordered by category.

  



