package com.example.gameapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class lastAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_acitivity)
        val correctNumber=intent.getIntExtra("numberIs",0)
        findViewById<TextView>(R.id.displayNumber).text="$correctNumber"

    }
}


