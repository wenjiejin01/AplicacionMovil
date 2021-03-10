package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StudyTech : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_tech)

        findViewById<Button>(R.id.botonPomodoro).setOnClickListener {
            val intentP = Intent(this, PomodoroActivity::class.java).apply {  }
            startActivity(intentP)
        }
    }
}