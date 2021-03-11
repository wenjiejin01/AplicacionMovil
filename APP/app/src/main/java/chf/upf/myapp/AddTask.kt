
package chf.upf.myapp

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Environment
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import chf.upf.myapp.ui.CalendarClass
import chf.upf.myapp.ui.CalendarInfo
import com.google.gson.Gson
import java.io.*
import java.util.*


class AddTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        // Spinner priority
        val spinner_priority: Spinner = findViewById(R.id.task_priority)
        ArrayAdapter.createFromResource(this, R.array.priority_array, android.R.layout.simple_spinner_item).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner_priority.adapter = adapter
        }
        val spinner_not: Spinner = findViewById(R.id.task_notification)
        ArrayAdapter.createFromResource(this, R.array.notification_array, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner_not.adapter = adapter
        }


        // Sent botton.
        val newtaskbutton : Button = findViewById<Button>(R.id.task_button)
        newtaskbutton.setOnClickListener {
            val intentLogin = Intent(this, Calendario_vista2::class.java).apply {}
            startActivity(intentLogin)
        }
    }
}