package chf.upf.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import chf.upf.myapp.ui.CalendarClass
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.gson.Gson
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class vista_semana : AppCompatActivity() {
    var data: Date = Date()
    var calendar: Calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_semana)

        //Load datefile
        val gson = Gson();
        val json = loadData("date.json")
        val calendarDb : CalendarClass = gson.fromJson(json, CalendarClass::class.javaObjectType)

        // Set head data information
        val format = SimpleDateFormat("yyyy-MM-dd")
        val format_mes = SimpleDateFormat("MM")
        val format_dia = SimpleDateFormat("dd")

        findViewById<TextView>(R.id.fecha_actual).setText(data.getThisMonth() + "\n" + data.getToday_name() + " " + data.getToday())

        val btn_previous = findViewById<ImageButton>(R.id.imageButton_Previous);
        btn_previous.setOnClickListener{
            val dateP = data.getlastweekToday();
            findViewById<TextView>(R.id.fecha_actual).setText(dateP[0] + "\n" + data.getToday_name() + " " + dateP)
        }
        val btn_next = findViewById<ImageButton>(R.id.imageButton_Next);
        btn_next.setOnClickListener{
            var previou_day = data.getToday()+7;
            findViewById<TextView>(R.id.fecha_actual).setText(data.getThisMonth() + "\n" + data.getToday_name() + " " + previou_day)
        }
        val btn_lunes = findViewById<Button>(R.id.btn_lunes);
        btn_lunes.isPressed = true;

        val btn_martes = findViewById<Button>(R.id.btn_martes);
        val btn_miercoles = findViewById<Button>(R.id.btn_miercoles);
        val btn_jueves = findViewById<Button>(R.id.btn_jueves);
        val btn_viernes = findViewById<Button>(R.id.btn_viernes);
        val btn_sabado = findViewById<Button>(R.id.btn_sabado);
        val btn_domingo = findViewById<Button>(R.id.btn_domingo);





        // Botton general
        findViewById<FloatingActionButton>(R.id.floatingActionButton4).setOnClickListener {
            val intentLogin = Intent(this, vistaHoy::class.java).apply {}
            startActivity(intentLogin)
        }

        findViewById<FloatingActionButton>(R.id.floatingActionButton5).setOnClickListener {
            val intentLogin = Intent(this, AddTask::class.java).apply {}
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

    fun Date.getToday_name(): String {
        val weekDays = arrayOf("Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")

        calendar.time = data
        var index: Int = calendar.get(Calendar.DAY_OF_WEEK) - 1
        if (index < 0) {
            index = 0
        }
        return weekDays[index]
    }

    fun Date.getThisMonth(): String {
        val MES = arrayOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre")

        calendar.time = data
        var index: Int = calendar.get(Calendar.MONTH) - 1
        if (index < 0) {
            index = 0
        }
        return MES[index]
    }

    fun Date.getToday(): Int {
        calendar.time = data
        var index: Int = calendar.get(Calendar.DAY_OF_MONTH)

        return index
    }

    fun Date.getlastweekToday(): String {
        var sdf = SimpleDateFormat("yyyy-MM-dd")
        val t: Long = calendar.getTimeInMillis()
        val l: Long = t - 24 * 3600 * 1000 * 7
        return sdf.format(l)
    }

}