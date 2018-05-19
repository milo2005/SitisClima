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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentCityBinding.inflate(inflater,container, false)

        return binding.root
    }


}
