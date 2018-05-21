package mobile.sitis.clima.ui.Clima

import android.arch.lifecycle.ViewModel
import io.reactivex.Single
import mobile.sitis.clima.data.apis.ClimaApi
import mobile.sitis.clima.data.models.Clima
import mobile.sitis.clima.util.applySchedulers
import javax.inject.Inject

class ClimaViewModel @Inject constructor(val api:ClimaApi):ViewModel(){


    fun getClima(city:String): Single<Clima> = api.getClima("select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22$city%2C%20co%22)", "json" ,"store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
            .map { it.results.channel }
            .map {
                val tem = it.item.condition.temp
                val pronostico = it.item.condition.text
                val hum = it.atmosphere.humidity
                val pres = it.atmosphere.pressure
                Clima(pronostico, tem, pres, hum)
            }
            .applySchedulers()

}