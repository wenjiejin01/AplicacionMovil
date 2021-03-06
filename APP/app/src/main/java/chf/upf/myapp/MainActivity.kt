package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userInputField = findViewById<EditText>(R.id.userText)
        val passwordInputField = findViewById<EditText>(R.id.passwordText)

        // Variables para falsear el inicio de sesion
        val username = "aplicacion"
        val password = "123"

        val lButton = findViewById<Button>(R.id.loginButton)


        lButton.setOnClickListener {
            if (userInputField.text.toString().equals(username)){
                if (passwordInputField.text.toString().equals(password)){
                    val intentLogin = Intent(this, StudyActivity::class.java).apply {}
                    startActivity(intentLogin)
                }else {
                    Toast.makeText(this, "El usuario o la contraseña son incorrectas", Toast.LENGTH_SHORT).show()
                }
            } else{
                Toast.makeText(this, "El usuario o la contraseña son incorrectas", Toast.LENGTH_SHORT).show()
            }
        }

        val rButton = findViewById<Button>(R.id.registerButton)
        rButton.setOnClickListener {
            val intentRegister = Intent(this, registerActivity::class.java).apply {}
            startActivity(intentRegister)
        }
    }

}