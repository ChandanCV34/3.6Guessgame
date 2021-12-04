package com.example.gameapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class wonAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_won_acitivity)
        val correctNumber=intent.getIntExtra("numberIs",0)
        findViewById<TextView>(R.id.correctAnswer).text="$correctNumber"
    }
}