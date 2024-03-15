package com.example.socialm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val logout = findViewById<Button>(R.id.logout)
        logout.setOnClickListener {
            val logout_btb = Intent(this, login::class.java)
            startActivity(logout_btb)
            finish()
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val addacc_btb = Intent(this, addaccount::class.java)
            startActivity(addacc_btb)
            finish()
        }

        val options_view = findViewById<ImageView>(R.id.options_view)
        options_view.setOnClickListener {
            val options_view_btb = Intent(this, home::class.java)
            startActivity(options_view_btb)
            finish()
        }
    }
}