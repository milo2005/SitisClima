package mobile.sitis.clima.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import mobile.sitis.clima.R
import mobile.sitis.clima.data.apis.ClimaApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApiModule{

    @Singleton
    @Provides
    @Named("token")
    fun provideToken():String = "abc"

    @Singleton
    @Provides
    fun provideRetrofit(context:Context):Retrofit = Retrofit.Builder()
                    .baseUrl(context.getString(R.string.url_base))
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
    @Singleton
    @Provides
    fun provideClimaApi(retrofit: Retrofit):ClimaApi = retrofit.create(ClimaApi::class.java)

}
