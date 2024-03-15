package com.example.socialm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast

class transfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer)


        class TransferActivity : AppCompatActivity() {

//            val banks = arrayOf("Commercial Bank", "Sampath Bank", "BOC")

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_transfer)

                val home5 = findViewById<Button>(R.id.home5)
                home5.setOnClickListener {
                    val home5_btb = Intent(this, profile::class.java)
                    startActivity(home5_btb)
                    finish()
                }
//                val imageView7 = findViewById<ImageView>(R.id.imageView7)
//                imageView7.setOnClickListener {
//                    val home5_btb = Intent(this, home::class.java)
//                    startActivity(home5_btb)
//                    finish()
//                }


//                val spinner = findViewById<Spinner>(R.id.spinner)
//                if (spinner != null) {
//                    val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, banks)
//                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//                    spinner.adapter = adapter
//
//                    spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                        override fun onItemSelected(
//                            parent: AdapterView<*>,
//                            view: View,
//                            position: Int,
//                            id: Long
//                        ) {
//                            Toast.makeText(
//                                this@TransferActivity,
//                                getString(R.string.selected_item) + " " + banks[position],
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }

//                        override fun onNothingSelected(parent: AdapterView<*>) {
                            // write code to perform some action
                        }
                    }
                }
            }
