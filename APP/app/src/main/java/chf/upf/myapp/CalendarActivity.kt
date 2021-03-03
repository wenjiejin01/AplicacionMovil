package chf.upf.myapp

import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginTop
import java.text.SimpleDateFormat;
import java.util.*
import chf.upf.myapp.ui.CalendarClass
import chf.upf.myapp.ui.CalendarInfo
import com.google.gson.Gson
import org.w3c.dom.Text
import java.io.IOException

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

        calendarView.setOnDateChangeListener { calendarView, i1, i2, i3 ->
            val month = i2 + 1;
            val date = format.format(format.parse("$i1-"+month+"-$i3"));
            if (date.equals(currentDate)) {
                today.setText("Today")
            }else{
                today.setText(date);
            }
            for (actividad in calendarDb.calendar){
                if (actividad.Date.equals(date)){
                    val new_layout = LinearLayout(this);
                    new_layout.setPadding(0, 5, 0, 5)
                    new_layout.setMargins()

                    val checkBox_dyn = CheckBox(this);
                    checkBox_dyn.setText("\t" + actividad.HoraInicio + actividad.Title)
                }
            }
        }

        //        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
        //            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                    .setAction("Action", null).show()
        //        }
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