package mobile.sitis.clima.ui.Clima

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import mobile.sitis.clima.R
import mobile.sitis.clima.data.models.Persona
import org.jetbrains.anko.toast
import javax.inject.Inject

class PersonaActivity : AppCompatActivity() {

    @Inject
    lateinit var persona: Persona

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persona)
        AndroidInjection.inject(this)

        toast(persona.nombre)

    }
}
