package mobile.sitis.clima.di.modules

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import mobile.sitis.clima.App

@Module
class AppModule{

    @Provides
    fun provideContext(app: App): Context = app


    @Provides
    fun providePreferences(context: Context):SharedPreferences =
            context.getSharedPreferences("clima", Context.MODE_PRIVATE)

}