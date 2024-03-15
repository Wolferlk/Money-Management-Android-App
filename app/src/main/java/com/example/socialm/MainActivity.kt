package com.example.socialm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginPageButton = findViewById<Button>(R.id.loginPagebutton)
        loginPageButton.setOnClickListener {
            val loginIntent = Intent(this, login::class.java)
            startActivity(loginIntent)
            finish()
        }

        val activityHomeButton = findViewById<Button>(R.id.signUp)
        activityHomeButton.setOnClickListener {
            val homeIntent = Intent(this, home ::class.java)
            startActivity(homeIntent)
            finish()


        }
    }
}
