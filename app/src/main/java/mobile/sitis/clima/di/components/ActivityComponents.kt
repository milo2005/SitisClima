package mobile.sitis.clima.di.components

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mobile.sitis.clima.ui.Clima.MainActivity
import mobile.sitis.clima.ui.Clima.PersonaActivity

@Module
abstract class ActivityComponents{


    @ContributesAndroidInjector()
    abstract fun bindMainActivity():MainActivity

    @ContributesAndroidInjector
    abstract fun bindPersonaActivity():PersonaActivity

}