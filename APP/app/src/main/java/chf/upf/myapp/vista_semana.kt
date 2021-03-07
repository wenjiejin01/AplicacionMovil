package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class vista_semana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_semana)

        findViewById<FloatingActionButton>(R.id.floatingActionButton4).setOnClickListener {
            val intentLogin = Intent(this, vistaHoy::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<FloatingActionButton>(R.id.floatingActionButton5).setOnClickListener {
            val intentLogin = Intent(this, AddTask::class.java).apply {}
            startActivity(intentLogin)
        }
    }
}