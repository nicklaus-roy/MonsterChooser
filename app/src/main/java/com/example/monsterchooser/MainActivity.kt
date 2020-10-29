package com.example.monsterchooser

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        restore saved state
        super.onCreate(savedInstanceState)
//        set content view
        setContentView(R.layout.activity_main)
//        register ui elements
//        bind events to code
        findViewById<ImageButton>(R.id.monster01).setOnClickListener { viewMonsterImage(R.drawable.monster01)}
        findViewById<ImageButton>(R.id.monster02).setOnClickListener { viewMonsterImage(R.drawable.monster02)}
        findViewById<ImageButton>(R.id.monster03).setOnClickListener { viewMonsterImage(R.drawable.monster03)}
        findViewById<ImageButton>(R.id.monster04).setOnClickListener { viewMonsterImage(R.drawable.monster04)}
    }

    private fun viewMonsterImage(monsterId: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.setAction(Intent.ACTION_VIEW)

        val uri = Uri.parse("http://com.example/monsterchooser/view?id=$monsterId")
        intent.data = uri


        intent.putExtra("monsterId", monsterId)
        startActivity(intent)
    }
}