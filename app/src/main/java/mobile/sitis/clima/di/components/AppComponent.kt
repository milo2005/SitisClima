package mobile.sitis.clima.di.components

import dagger.BindsInstance
import dagger.Component
import mobile.sitis.clima.App
import mobile.sitis.clima.di.modules.AppModule

@Component(modules = [AppModule::class])
interface AppComponent{

    fun inject(app: App)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(app:App):AppComponent.Builder

        fun build():AppComponent
    }



}