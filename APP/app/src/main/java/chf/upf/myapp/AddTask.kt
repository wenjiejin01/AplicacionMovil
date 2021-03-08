package chf.upf.myapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import chf.upf.myapp.ui.CalendarInfo
import com.google.gson.Gson
import java.io.BufferedWriter
import java.io.FileWriter

class AddTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

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

        val newtaskbutton : Button = findViewById<Button>(R.id.task_button)
        newtaskbutton.setOnClickListener {

            val title = findViewById<EditText>(R.id.tasktitle)
            val description = findViewById<EditText>(R.id.taskdescrip)
            val dia = findViewById<EditText>(R.id.taskdate)
            val init = findViewById<EditText>(R.id.inittime)
            val end = findViewById<EditText>(R.id.endtime)
            val priority = findViewById<Spinner>(R.id.task_priority)
            val notifi = findViewById<Spinner>(R.id.task_notification)

            val tarea = CalendarInfo(title.text.toString(), description.text.toString(), dia.text.toString(),
                    init.text.toString(),end.text.toString(),priority.toString(),notifi.toString(),false)
            val gson = Gson()
            val json = gson.toJson(tarea)

            val file = "date.json"
            val path = "android.assets.openFd($file)"
            val bw = BufferedWriter(FileWriter(path, true))
            bw.write(json)

            val intenttask = Intent(this, SeeTask::class.java).apply{}
            startActivity(intenttask)
            Toast.makeText(this, "La tarea ha sido creada correctamente", Toast.LENGTH_SHORT).show()

        }

    }
}