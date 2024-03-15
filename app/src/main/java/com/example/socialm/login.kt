package com.example.socialm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val homeIntent = Intent(this, home::class.java)
            startActivity(homeIntent)
            finish()
        }

        val forget = findViewById<Button>(R.id.forget)
        forget.setOnClickListener {
            val reset = Intent(this, resetpassword::class.java)
            startActivity(reset)
            finish()
        }

            val signUp = findViewById<Button>(R.id.signUp)
            signUp.setOnClickListener {
                val actsignUp = Intent(this, MainActivity::class.java)
                startActivity(actsignUp)
                finish()
            }

        }
    }
