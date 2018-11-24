package com.kotlin.intermediatetask.kotlinintermediatetask

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var lvbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvbutton = findViewById(R.id.button1)

        lvbutton.setOnClickListener {

            startActivity(Intent(this, listView::class.java))
        }
    }
}
