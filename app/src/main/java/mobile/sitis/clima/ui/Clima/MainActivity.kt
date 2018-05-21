package mobile.sitis.clima.ui.Clima

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import mobile.sitis.clima.R
import mobile.sitis.clima.data.models.Persona
import mobile.sitis.clima.di.Injectable
import org.jetbrains.anko.startActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity(), Injectable {

    @Inject
    lateinit var persona:Persona

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        persona.nombre = "DArio"

        startActivity<PersonaActivity>()
    }
}
