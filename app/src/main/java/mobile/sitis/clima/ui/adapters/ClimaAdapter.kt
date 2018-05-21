package mobile.sitis.clima.ui.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import mobile.sitis.clima.ui.Clima.CityFragment

class ClimaAdapter(fm:FragmentManager): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment = when(position){
        0-> CityFragment.instance(CityFragment.CITY_POPAYAN)
        1-> CityFragment.instance(CityFragment.CITY_CALI)
        else -> CityFragment.instance(CityFragment.CITY_BOGOTA)
    }

    override fun getCount(): Int  = 3

    override fun getPageTitle(position: Int): CharSequence? = when(position){
        0 -> "Popayan"
        1 -> "Cali"
        else -> "Bog."
    }

}