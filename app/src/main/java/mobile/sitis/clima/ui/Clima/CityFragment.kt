package mobile.sitis.clima.ui.Clima


import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jakewharton.rxbinding2.view.clicks
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.fragment_city.*

import mobile.sitis.clima.R
import mobile.sitis.clima.databinding.FragmentCityBinding
import mobile.sitis.clima.di.Injectable
import mobile.sitis.clima.util.LifeDisposable
import mobile.sitis.clima.util.LifeDisposable_LifecycleAdapter
import mobile.sitis.clima.util.buildViewModel
import javax.inject.Inject


class CityFragment : Fragment(), Injectable {

    @Inject
    lateinit var factory:ViewModelProvider.Factory
    val viewModel:ClimaViewModel by lazy { buildViewModel<ClimaViewModel>(factory) }
    val dis: LifeDisposable = LifeDisposable(this)


    lateinit var binding:FragmentCityBinding
    val city:String by lazy{ arguments!!.getString("city")}



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentCityBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        // dis add refresh.clicks()
        //         .flatMapSingle { viewModel.getClima(city) }


       /* dis add viewModel.getClima(city)
                .subscribeBy (
                        onSuccess = {

                        },
                        onError = {

                        }
                )*/
    }

    companion object {
        val CITY_POPAYAN = "popayan"
        val CITY_CALI = "cali"
        val CITY_BOGOTA = "bogota"

        fun instance(city:String):CityFragment{
            val fragment = CityFragment()
            val args = Bundle()
            args.putString("city", city)
            fragment.arguments = args
            return fragment
        }
    }


}
