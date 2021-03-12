package chf.upf.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pagament : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagament)

        findViewById<Button>(R.id.botonPago).setOnClickListener{
            val intentP = Intent(this, study_tech_premium::class.java).apply {  }
            startActivity(intentP)
        }
    }
}