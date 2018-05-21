package mobile.sitis.clima

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import mobile.sitis.clima.di.AppInjector
import mobile.sitis.clima.di.components.DaggerAppComponent
import javax.inject.Inject

class App:Application(), HasActivityInjector{

    @Inject
    lateinit var injector:DispatchingAndroidInjector<Activity>


    override fun onCreate() {
        super.onCreate()

        AppInjector.init(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = injector

}