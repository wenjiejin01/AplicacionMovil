package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class study_tech_premium : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_tech_premium)

        Toast.makeText(this, "Bienvenido a Time to Start Premium!!!", Toast.LENGTH_SHORT).show()

        findViewById<Button>(R.id.botonPomodoro).setOnClickListener {
            val intentP = Intent(this, PomodoroActivity::class.java).apply {  }
            startActivity(intentP)
        }
    }
}