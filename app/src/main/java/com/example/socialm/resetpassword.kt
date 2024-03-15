package com.example.socialm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class resetpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resetpassword)


        val newAccount = findViewById<Button>(R.id.newAccount)
        newAccount.setOnClickListener {
            val actnewAccount = Intent(this, MainActivity::class.java)
            startActivity(actnewAccount)
            finish()
        }

        val backToLogin = findViewById<Button>(R.id.backToLogin)
        backToLogin.setOnClickListener {
            val actbackToLogin = Intent(this, login::class.java)
            startActivity(actbackToLogin)
            finish()
        }
    }
}