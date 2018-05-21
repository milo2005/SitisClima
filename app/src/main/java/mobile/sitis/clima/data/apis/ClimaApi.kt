package mobile.sitis.clima.data.apis

import io.reactivex.Single
import retrofit2.http.*

interface ClimaApi{

    @GET("public/yql")
    fun getClima(@Query("q") q:String, @Query("format") format:String,
                 @Query("env") env:String): Single<Weather>

    @POST("")
    fun addClima(@Header("Authorization") token:String ,@Body weather:Weather)

}
class Condition( val temp:String, val text:String)
class Item (val condition:Condition)
class Atmosphere(val humidity:String, val pressure:String)
class Channel(val atmosphere: Atmosphere, val item:Item)
class Result(val channel:Channel)
class Weather(val results:Result)