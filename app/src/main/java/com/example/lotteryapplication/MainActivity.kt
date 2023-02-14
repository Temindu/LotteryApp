package com.example.lotteryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton: Button = findViewById(R.id.mainButton)
        val textOne: TextView = findViewById(R.id.textView1)
        val textTwo: TextView = findViewById(R.id.textView2)
        val textThree: TextView = findViewById(R.id.textView3)
        val textFour: TextView = findViewById(R.id.textView4)
        val textFive: TextView = findViewById(R.id.textView5)
        val textSix: TextView = findViewById(R.id.textView6)
        val inputText: EditText = findViewById(R.id.InputFeild)

        val buttonOne: Button = findViewById(R.id.Button1)
        val buttonTwo: Button = findViewById(R.id.Button2)
        val buttonThree: Button = findViewById(R.id.Button3)
        val buttonFour: Button = findViewById(R.id.Button4)
        val buttonFive: Button = findViewById(R.id.Button5)
        val buttonSix: Button = findViewById(R.id.Button6)

        var myRandomValues = mutableListOf<Int>()

        clickButton.setOnClickListener {
            val excludeNumber: Int = Integer.parseInt(inputText.text.toString())
            myRandomValues = MutableList(6) {getRandom(excludeNumber)}
            Log.d("myTag", myRandomValues.toString());
            textOne.text = myRandomValues[0].toString()
            textTwo.text = myRandomValues[1].toString()
            textThree.text = myRandomValues[2].toString()
            textFour.text = myRandomValues[3].toString()
            textFive.text = myRandomValues[4].toString()
            textSix.text = myRandomValues[5].toString()

        }

        buttonOne.setOnClickListener {
            var random = 0
            do {
                random = Random.nextInt(1,50)
            } while (random in myRandomValues)
            textOne.text = random.toString()
        }

        buttonTwo.setOnClickListener {
            var random = 0
            do{
                random = Random.nextInt(1,50)
            } while (random in myRandomValues)
            textTwo.text = random.toString()
        }

        buttonThree.setOnClickListener {
            var random = 0
            do{
                random = Random.nextInt(1,50)
            }while (random in myRandomValues)
            textThree.text = random.toString()
        }

        buttonFour.setOnClickListener {
            var random = 0
            do{
                random = Random.nextInt(1,50)
            }while (random in myRandomValues)
            textFour.text = random.toString()
        }

        buttonFive.setOnClickListener {
            var random = 0
            do{
                random = Random.nextInt(1,50)
            }while (random in myRandomValues)
            textFive.text = random.toString()
        }

        buttonSix.setOnClickListener {
            var random = 0
            do{
                random = Random.nextInt(1,50)
            }while (random in myRandomValues)
            textSix.text = random.toString()
        }

    }

    fun getRandom(excludeNumber: Int): Int {
        var random = 0
        if(excludeNumber != null){
            do {
                random = Random.nextInt(1,50)
            } while ( random == excludeNumber)
        }


        return random
    }
}