package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ConfigurationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuration)


        val closeSession = findViewById<Button>(R.id.closeSessionButton)
        closeSession.setOnClickListener {
            val intentCloseSession = Intent(this, MainActivity::class.java).apply {  }
            startActivity(intentCloseSession)
        }

        findViewById<ImageButton>(R.id.imageButton16).setOnClickListener {
            val intentLogin = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.imageButton17).setOnClickListener {
            val intentLogin = Intent(this, compartir1::class.java).apply {}
            startActivity(intentLogin)
        }

    }
}