package com.example.socialm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class expencess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expencess)

        val expen_btn = findViewById<Button>(R.id.expen_btn)
        expen_btn.setOnClickListener {
            val homeexpen_btn = Intent(this, home::class.java)
            startActivity(homeexpen_btn)
            finish()
        }

    }
}