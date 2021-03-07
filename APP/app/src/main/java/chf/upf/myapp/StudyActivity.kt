package chf.upf.myapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView


class StudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study)

        val pomodoroMedia = MediaController(this)
        val pomodoroView = findViewById<VideoView>(R.id.pomodoroView)
        pomodoroMedia.setAnchorView(pomodoroView)

        val pomodoroUri = Uri.parse("android.resources://$packageName/${R.raw.pomodoro}")

        pomodoroView.setMediaController(pomodoroMedia)
        pomodoroView.setVideoURI(pomodoroUri)
        pomodoroView.requestFocus()
        pomodoroView.start()

    }
}

