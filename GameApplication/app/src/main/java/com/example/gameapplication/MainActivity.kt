package com.example.gameapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var number= Random.nextInt(1,1000)

        var count=0
        val guessDigit=findViewById<TextInputLayout>(R.id.digitGuess)
        val clickRight=findViewById<TextView>(R.id.clickAnswer)
        val displayAnswer=findViewById<TextView>(R.id.displayMessage)

        clickRight.setOnClickListener {
            try {
            val userName=guessDigit.editText?.text?.toString()
            val userGuess = Integer.parseInt(userName);

       val answer=
           if(userGuess < 0 ) { count++
               "Please Enter a Positive Digit"}
           else if(userGuess > number){ count ++
               "No;)  My Number is Smaller"}
           else if(userGuess<number){ count++
               "No;) My Number is Greater "}
           else{
               val wonScreenIntent= Intent(this,wonAcitivity::class.java)
               wonScreenIntent.putExtra("numberIs",number)
               startActivity(wonScreenIntent)
               "!!congo!!"
           }
       displayAnswer.text = "$answer"
       if (count==12)
       {
           val lastScreenIntent= Intent(this,lastAcitivity::class.java)
           lastScreenIntent.putExtra("numberIs",number)
           startActivity(lastScreenIntent)
       }
   }  catch (e:Exception){
       displayAnswer.text= "Please Enter a number"
   }


        }


    }


}