package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class configuracion_premium : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion_premium)

        val closeSession = findViewById<Button>(R.id.closeSessionButton)
        closeSession.setOnClickListener {
            val intentCloseSession = Intent(this, MainActivity::class.java).apply {  }
            startActivity(intentCloseSession)
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


        findViewById<Button>(R.id.studyButton).setOnClickListener {
            val intentStudy = Intent(this, study_tech_premium::class.java).apply {}
            startActivity(intentStudy)
        }

        findViewById<Button>(R.id.statsButton).setOnClickListener {
            val intentStats = Intent(this, Stats::class.java).apply {}
            startActivity(intentStats)
        }

        findViewById<Button>(R.id.friendsconfigButton).setOnClickListener {
            val intentFriedns = Intent(this, SeeFriends::class.java).apply {}
            startActivity(intentFriedns)
        }
    }
}