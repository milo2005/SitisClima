package mobile.sitis.clima.di.components

import dagger.Component
import mobile.sitis.clima.App
import mobile.sitis.clima.di.modules.AppModule

@Component(modules = [AppModule::class])
interface AppComponent{

    fun inject(app: App)



}