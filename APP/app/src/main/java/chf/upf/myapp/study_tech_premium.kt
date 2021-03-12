package chf.upf.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class study_tech_premium : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_tech_premium)

        Toast.makeText(this, "Bienvenido a Time to Start Premium!!!", Toast.LENGTH_SHORT).show()
    }
}