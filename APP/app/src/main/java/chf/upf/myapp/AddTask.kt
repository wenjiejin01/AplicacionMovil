package chf.upf.myapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

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

            val intenttask = Intent(this, SeeTask::class.java).apply{}
            startActivity(intenttask)

        }


    }
}