package chf.upf.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import chf.upf.myapp.ui.CalendarClass
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.gson.Gson
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*
import android.widget.ImageButton


class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        //Load datefile
        val gson = Gson();
        val json = loadData("date.json")
        val calendarDb : CalendarClass = gson.fromJson(json, CalendarClass::class.javaObjectType)
        // Set head data information
        val format = SimpleDateFormat("yyyy-MM-dd")
        val currentDate = format.format(System.currentTimeMillis())

        findViewById<TextView>(R.id.Date).setText(currentDate);

        val calendarView = findViewById<CalendarView>(R.id.calendar);
        val today = findViewById<TextView>(R.id.dayInfo);
        var mLinearLayout : LinearLayout = findViewById(R.id.Activitis) as LinearLayout
        mLinearLayout.removeAllViews()
        for (actividad in calendarDb.calendar) {
            if (actividad.Date.equals(currentDate)){
                val new_layout = LinearLayout(this);
                new_layout.setPadding(0, 5, 0, 5)
                new_layout.isClickable = true;
                new_layout.orientation = LinearLayout.HORIZONTAL;

                val checkBox_dyn = CheckBox(this);
                checkBox_dyn.setText("\t" + actividad.HoraInicio + " - " + actividad.HoraFinal + "\t" + actividad.Title)
                checkBox_dyn.setPadding(10, 0, 0, 0)
                if (actividad.done) {
                    checkBox_dyn.isChecked = true;
                }
                new_layout.addView(checkBox_dyn)

                mLinearLayout.addView(new_layout)

            }
        }

        calendarView.setOnDateChangeListener { calendarView, i1, i2, i3 ->
            val month = i2 + 1;
            val date = format.format(format.parse("$i1-" + month + "-$i3"));
            if (date.equals(currentDate)) {
                today.setText("Today")
            }else{
                today.setText(date);
            }
            var mLinearLayout : LinearLayout = findViewById(R.id.Activitis) as LinearLayout
            mLinearLayout.removeAllViews()
            for (actividad in calendarDb.calendar){
                if (actividad.Date.equals(date)){
                    val new_layout = LinearLayout(this);
                    new_layout.setPadding(0, 5, 0, 5)
                    new_layout.isClickable = true;
                    new_layout.orientation = LinearLayout.HORIZONTAL;

                    val checkBox_dyn = CheckBox(this);
                    checkBox_dyn.setText("\t" + actividad.HoraInicio + " - " + actividad.HoraFinal + "\t" + actividad.Title)
                    checkBox_dyn.setPadding(10, 0, 0, 0)
                    if (actividad.done) {
                        checkBox_dyn.isChecked = true;
                    }
                    new_layout.addView(checkBox_dyn)

                    mLinearLayout.addView(new_layout)

                }
            }
        }



        // Conexiones
        findViewById<FloatingActionButton>(R.id.floatingActionButton4).setOnClickListener {
            val intentLogin = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<FloatingActionButton>(R.id.floatingActionButton5).setOnClickListener {
            val intentLogin = Intent(this, AddTask::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.config).setOnClickListener {
            val intentLogin = Intent(this, ConfigurationActivity::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.menu).setOnClickListener {
            val intentLogin = Intent(this, vista_semana::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<ImageButton>(R.id.menu_compartir).setOnClickListener {
            val intentLogin = Intent(this, compartir1::class.java).apply {}
            startActivity(intentLogin)
        }

        // findViewById<ImageButton>(R.id.imageButton).setOnClickListener{
        //    val intentLogin = Intent(this, AddTask::class.java).apply {}
        //     startActivity(intentLogin)
        // }




    }

    fun loadData(inFile: String):String{
        var tContents = ""
        try {
            val stream = assets.open(inFile)
            val size = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()
            tContents = String(buffer)
        } catch (e: IOException){

        }

        return tContents;
    }
}