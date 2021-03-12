package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class StudyTech : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_tech)

        findViewById<Button>(R.id.botonPomodoro).setOnClickListener {
            val intentP = Intent(this, PomodoroActivity::class.java).apply {  }
            startActivity(intentP)
        }

        findViewById<Button>(R.id.botonTecnica2).setOnClickListener {
            val intentP = Intent(this, Pagament::class.java).apply {  }
            startActivity(intentP)
        }

        findViewById<Button>(R.id.botonTecnica3).setOnClickListener {
            val intentP = Intent(this, Pagament::class.java).apply {  }
            startActivity(intentP)
        }
    }
}