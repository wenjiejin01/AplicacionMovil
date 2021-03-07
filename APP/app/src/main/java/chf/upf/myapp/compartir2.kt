package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class compartir2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compartir2)

        findViewById<Button>(R.id.cancelar_compartir1).setOnClickListener {
            val intentLogin = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<Button>(R.id.compartir_actividad).setOnClickListener {
            val intentLogin = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.imageButton6).setOnClickListener {
            val intentLogin = Intent(this, ConfigurationActivity::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.imageButton7).setOnClickListener {
            val intentLogin = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentLogin)
        }
    }
}