package com.example.socialm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class history : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val homerr = findViewById<ImageView>(R.id.homerr)
        homerr.setOnClickListener {
            val actadd_fund_btn = Intent(this, home::class.java)
            startActivity(actadd_fund_btn)
            finish()
        }

        val historyDataa = arrayOf("LKR 2500  Expence for Class Fee", "LKR 5000  Expence for Helth", "LKR 50 000  Add Fund from March salary", "LKR 6500  Expence for car service", "LKR 10 000  Add Fund from Kasun herath","LKR 2500  Expence for Class Fee", "LKR 5000  Expence for Helth", "LKR 50 000  Add Fund from March salary", "LKR 6500  Expence for car service", "LKR 10 000  Add Fund from Kasun herath", "LKR 5000  Expence for Helth", "LKR 50 000  Add Fund from March salary", "LKR 6500  Expence for car service", "LKR 10 000  Add Fund from Kasun herath","LKR 2500  Expence for Class Fee", "LKR 5000  Expence for Helth", "LKR 50 000  Add Fund from March salary", "LKR 6500  Expence for car service", "LKR 10 000  Add Fund from Kasun herath")

        // Get the ListView reference
        val historyListVieww = findViewById<ListView>(R.id.hislist)

        // Create an ArrayAdapter to populate data into the ListView
        val adapterr = ArrayAdapter(this, android.R.layout.simple_list_item_1, historyDataa)

        // Set the adapter to the ListView
        historyListVieww.adapter = adapterr

        // Optionally, handle item click events
        historyListVieww.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = historyDataa[position]
            Toast.makeText(this, "Clicked on: $selectedItem", Toast.LENGTH_SHORT).show()
        }



    }
}