package mobile.sitis.clima.di.components

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import mobile.sitis.clima.App
import mobile.sitis.clima.di.modules.ApiModule
import mobile.sitis.clima.di.modules.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
    ApiModule::class,
    ActivityComponents::class,
    AndroidInjectionModule::class])
interface AppComponent{

    fun inject(app: App)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(app:App):AppComponent.Builder

        fun build():AppComponent
    }



}