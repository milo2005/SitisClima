package mobile.sitis.clima.di.modules

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import mobile.sitis.clima.App
import mobile.sitis.clima.data.models.Persona
import javax.inject.Singleton

@Module
class AppModule{

    @Singleton
    @Provides
    fun provideContext(app: App): Context = app


    @Singleton
    @Provides
    fun providePreferences(context: Context):SharedPreferences =
            context.getSharedPreferences("clima", Context.MODE_PRIVATE)

}