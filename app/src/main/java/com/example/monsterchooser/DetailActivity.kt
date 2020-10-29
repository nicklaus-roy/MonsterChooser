package com.example.monsterchooser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        Log.i("Intents", "Action = ${intent.action}")

        val lastPart = intent.data?.lastPathSegment
        if(lastPart!!.equals("view")) {
            val monsterId = intent.data?.getQueryParameter("id")
            Log.i("Query", "$monsterId")
        }

        val extraId = intent.extras!!.getInt("monsterId")
        Log.i("Intents", "$extraId")

        findViewById<ImageView>(R.id.monster).setImageResource(extraId)
    }
}