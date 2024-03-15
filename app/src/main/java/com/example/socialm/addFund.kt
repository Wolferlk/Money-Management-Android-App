package com.example.socialm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class addFund : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_fund)


        val add_btn = findViewById<Button>(R.id.add_btn)
        add_btn.setOnClickListener {
            val homeIntent = Intent(this, home ::class.java)
            startActivity(homeIntent)
            finish()


        }

    }
}