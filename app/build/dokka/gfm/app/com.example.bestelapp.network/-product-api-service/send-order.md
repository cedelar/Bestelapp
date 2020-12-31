//[app](../../index.md)/[com.example.bestelapp.network](../index.md)/[ProductApiService](index.md)/[sendOrder](send-order.md)



# sendOrder  
[androidJvm]  
Content  
@Headers(value = ["Content-Type: application/json"])  
@POST(value = "bestel")  
  
abstract fun [sendOrder](send-order.md)(@Body()data: [DataWrapper](../../com.example.bestelapp.data.datawrapper/-data-wrapper/index.md)): Call<[ServerResponse](../../com.example.bestelapp.data.datawrapper/-server-response/index.md)>  
More info  


Function sending a Post request to the '/bestel' endpoint of the server.



#### Return  


A Call containing the [ServerResponse](../../com.example.bestelapp.data.datawrapper/-server-response/index.md) that the server send.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.example.bestelapp.network/ProductApiService/sendOrder/#com.example.bestelapp.data.datawrapper.DataWrapper/PointingToDeclaration/"></a>data| <a name="com.example.bestelapp.network/ProductApiService/sendOrder/#com.example.bestelapp.data.datawrapper.DataWrapper/PointingToDeclaration/"></a><br><br>The [DataWrapper](../../com.example.bestelapp.data.datawrapper/-data-wrapper/index.md) object to be send to the server<br><br>
  
  



