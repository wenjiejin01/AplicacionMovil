package chf.upf.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rButton = findViewById<Button>(R.id.registroButton)
        rButton.setOnClickListener {
            Toast.makeText(this, "Has pulsado el botón de registro", Toast.LENGTH_SHORT).show()
        }

        val iButton = findViewById<Button>(R.id.identificacionButton)
        iButton.setOnClickListener {
            Toast.makeText(this, "Has pulsado el botón de identificación", Toast.LENGTH_SHORT).show()

            val intentLogin = Intent(this, LoginActivitie::class.java).apply {}
            startActivity(intentLogin)
        }


    }
}