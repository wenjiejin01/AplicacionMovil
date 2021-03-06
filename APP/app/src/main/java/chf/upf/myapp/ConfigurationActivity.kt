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

        findViewById<ImageButton>(R.id.menu).setOnClickListener {
            val intentVistaSemana = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentVistaSemana)
        }

        findViewById<ImageButton>(R.id.menu_compartir).setOnClickListener {
            val intentVistaCompartir = Intent(this, compartir1::class.java).apply {}
            startActivity(intentVistaCompartir)
        }


        findViewById<Button>(R.id.studyButton).setOnClickListener {
            val intentStudy = Intent(this, StudyTech::class.java).apply {}
            startActivity(intentStudy)
        }

        findViewById<Button>(R.id.statsButton).setOnClickListener {
            val intentStats = Intent(this, Pagament::class.java).apply {}
            startActivity(intentStats)
        }

        findViewById<Button>(R.id.friendsconfigButton).setOnClickListener {
            val intentFriedns = Intent(this, SeeFriends::class.java).apply {}
            startActivity(intentFriedns)
        }

    }
}