package com.example.socialm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CurrencyCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_calculator)

        val buttonConvert = findViewById<Button>(R.id.buttonConvert)
        buttonConvert.setOnClickListener {
            val home5_btb = Intent(this, home::class.java)
            startActivity(home5_btb)
            finish()
        }
    }
}