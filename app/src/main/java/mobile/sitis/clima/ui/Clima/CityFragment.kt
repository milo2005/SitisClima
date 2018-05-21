package mobile.sitis.clima.ui.Clima


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import mobile.sitis.clima.R
import mobile.sitis.clima.databinding.FragmentCityBinding


class CityFragment : Fragment() {

    lateinit var binding:FragmentCityBinding
    val city:String by lazy{ arguments!!.getString("city")}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentCityBinding.inflate(inflater,container, false)

        return binding.root
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
