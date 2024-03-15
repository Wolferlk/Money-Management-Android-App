package com.example.socialm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class home : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val add_fund_btn = findViewById<Button>(R.id.add_fund_btn)
        add_fund_btn.setOnClickListener {
            val actadd_fund_btn = Intent(this, addFund::class.java)
            startActivity(actadd_fund_btn)
            finish()
        }


        val expencess_btn = findViewById<Button>(R.id.expencess_btn)
        expencess_btn.setOnClickListener {
            val actexpencess_btn = Intent(this, expencess::class.java)
            startActivity(actexpencess_btn)
            finish()
        }

        

        val Pro_btn = findViewById<ImageView>(R.id.Pro_btn)
        Pro_btn.setOnClickListener {
            val Pro_btn1 = Intent(this, profile::class.java)
            startActivity(Pro_btn1)
            finish()
        }

        val calbtn = findViewById<ImageView>(R.id.calbtn)
        calbtn.setOnClickListener {
            val Pro_calbtn = Intent(this, CurrencyCalculator::class.java)
            startActivity(Pro_calbtn)
            finish()
        }

        val sendm = findViewById<ImageButton>(R.id.sendm)
        sendm.setOnClickListener {
            val Pro_sendm = Intent(this, transfer::class.java)
            startActivity(Pro_sendm)
            finish()
        }


        val sendbtn3 = findViewById<ImageView>(R.id.sendbtn3)
        sendbtn3.setOnClickListener {
            val Pro_sendm = Intent(this, transfer::class.java)
            startActivity(Pro_sendm)
            finish()
        }

        val historybtn = findViewById<ImageView>(R.id.historybtn)
        historybtn.setOnClickListener {
            val history_btn14 = Intent(this, history::class.java)
            startActivity(history_btn14)
            finish()
        }




        val historyData = arrayOf("LKR 2500  Expence for Class Fee", "LKR 5000  Expence for Helth", "LKR 50 000  Add Fund from March salary", "LKR 6500  Expence for car service", "LKR 10 000  Add Fund from Kasun herath","LKR 2500  Expence for Class Fee", "LKR 5000  Expence for Helth", "LKR 50 000  Add Fund from March salary", "LKR 6500  Expence for car service", "LKR 10 000  Add Fund from Kasun herath")

        // Get the ListView reference
        val historyListView = findViewById<ListView>(R.id.hislist)

        // Create an ArrayAdapter to populate data into the ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, historyData)

        // Set the adapter to the ListView
        historyListView.adapter = adapter

        // Optionally, handle item click events
        historyListView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = historyData[position]
            Toast.makeText(this, "Clicked on: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}





