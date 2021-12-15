package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var zar1Image : ImageView = findViewById(R.id.zar1)
        var zar2Image : ImageView = findViewById(R.id.zar2)
        var button : Button = findViewById(R.id.button)

        button.setOnClickListener {

            var random1 = (1..6).random()
            var random2 = (1..6).random()

            when(random1){
                1 -> zar1Image.setImageResource(R.drawable.dice_1)
                2 -> zar1Image.setImageResource(R.drawable.dice_2)
                3 -> zar1Image.setImageResource(R.drawable.dice_3)
                4 -> zar1Image.setImageResource(R.drawable.dice_4)
                5 -> zar1Image.setImageResource(R.drawable.dice_5)
                6 -> zar1Image.setImageResource(R.drawable.dice_6)
            }

            when(random2){
                1 -> zar2Image.setImageResource(R.drawable.dice_1)
                2 -> zar2Image.setImageResource(R.drawable.dice_2)
                3 -> zar2Image.setImageResource(R.drawable.dice_3)
                4 -> zar2Image.setImageResource(R.drawable.dice_4)
                5 -> zar2Image.setImageResource(R.drawable.dice_5)
                6 -> zar2Image.setImageResource(R.drawable.dice_6)

            }



        }

    }
}