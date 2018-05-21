package mobile.sitis.clima.ui.Clima

import android.arch.lifecycle.ViewModel
import io.reactivex.Single
import mobile.sitis.clima.data.apis.ClimaApi
import mobile.sitis.clima.data.models.Clima
import mobile.sitis.clima.util.applySchedulers
import javax.inject.Inject

class ClimaViewModel @Inject constructor(val api:ClimaApi):ViewModel(){


    fun getClima(): Single<Clima> = api.getClima("", "" ,"")
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