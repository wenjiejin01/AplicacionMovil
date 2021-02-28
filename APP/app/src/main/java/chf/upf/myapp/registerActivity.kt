package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val rdButton = findViewById<Button>(R.id.registeredButton)
        rdButton.setOnClickListener {
            val backMain = Intent(this, MainActivity::class.java).apply {}
            startActivity(backMain)
        }

    }
}