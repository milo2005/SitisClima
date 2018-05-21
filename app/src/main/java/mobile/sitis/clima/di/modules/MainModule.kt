package mobile.sitis.clima.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mobile.sitis.clima.ui.Clima.CityFragment

@Module
abstract class MainModule{

    @ContributesAndroidInjector
    abstract fun bindCityFragment():CityFragment

}