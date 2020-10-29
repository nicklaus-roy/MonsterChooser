package com.example.monsterchooser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_main)

        val booleanValue = false
        val number1 = 10
        val number2 = 20
//        android
        Log.i("My custom log", "Sum: ${number1+number2}")

        val age = 20
//        if(age <= 20) {
//            Log.i("My custom log", "Probably a student")
//        } else if (age > 20) {
//            Log.i("My custom log", "Probably working")
//        } else {
//            Log.i("My custom log", "Working?")
//        }

        val result = if(age <= 20) {
            Log.i("My custom log", "Probably a student")
        } else if (age > 20) {
            Log.i("My custom log", "Probably working")
        } else {
            Log.i("My custom log", "Working?")
        }
        Log.i("My custom log", "Result: $result")
    }
}