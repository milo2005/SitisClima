package mobile.sitis.clima.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import mobile.sitis.clima.di.ViewModelKey
import mobile.sitis.clima.ui.Clima.ClimaViewModel
import mobile.sitis.clima.util.AppViewModelFactory
import mobile.sitis.clima.util.AppViewModelFactory_Factory

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindFactory(factory: AppViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(ClimaViewModel::class)
    abstract fun bindClimaViewModel(climaViewModel: ClimaViewModel):ViewModel



}