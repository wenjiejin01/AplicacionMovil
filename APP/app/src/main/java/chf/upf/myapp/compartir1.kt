package chf.upf.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton

class compartir1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compartir1)

        findViewById<Button>(R.id.cancelar_compartir1).setOnClickListener {
            val intentLogin = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<Button>(R.id.compartir_amigos).setOnClickListener {
            val intentLogin = Intent(this, compartir2::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.config).setOnClickListener {
            val intentLogin = Intent(this, ConfigurationActivity::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.menu).setOnClickListener {
            val intentLogin = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.menu_compartir).setOnClickListener {
            val intentLogin = Intent(this, compartir1::class.java).apply {}
            startActivity(intentLogin)
        }
    }
}