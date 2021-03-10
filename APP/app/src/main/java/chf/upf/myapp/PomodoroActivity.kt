package chf.upf.myapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView


class PomodoroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pomodoro)

        val pomodoroMedia = MediaController(this)

        val pomodoroView = findViewById<VideoView>(R.id.pomodoroView)
        pomodoroMedia.setAnchorView(pomodoroView)

        val pomodoroUrionline = Uri.parse("https://video.wixstatic.com/video/d1a497_ec3c4cd5cc924dcbbfd6a5d2a8d9b9d2/480p/mp4/file.mp4")
        // val pomodoroUri = Uri.parse("android.resources://"+getPackageName()+"/"+R.raw.pomodoro)

        pomodoroView.setMediaController(pomodoroMedia)
        pomodoroView.setVideoURI(pomodoroUrionline)
        pomodoroView.requestFocus()
        pomodoroView.start()

    }
}

