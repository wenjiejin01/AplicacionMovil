package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class vistaHoy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vista_hoy)

        findViewById<FloatingActionButton>(R.id.floatingActionButton4).setOnClickListener {
            val intentLogin = Intent(this, CalendarActivity::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<FloatingActionButton>(R.id.floatingActionButton5).setOnClickListener {
            val intentLogin = Intent(this, AddTask::class.java).apply {}
            startActivity(intentLogin)
        }
    }
}