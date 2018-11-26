package com.kotlin.intermediatetask.kotlinintermediatetask

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kotlin.intermediatetask.kotlinintermediatetask.activity.CustomListView
import com.kotlin.intermediatetask.kotlinintermediatetask.activity.RecyclerView
import com.kotlin.intermediatetask.kotlinintermediatetask.activity.listView

class MainActivity : AppCompatActivity() {

    lateinit var lvbutton: Button
    lateinit var lvbutton1: Button
    lateinit var lvbutton2: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvbutton = findViewById(R.id.button1)

        lvbutton.setOnClickListener {

            startActivity(Intent(this, listView::class.java))
        }

        lvbutton1 = findViewById(R.id.button2)

        lvbutton1.setOnClickListener {

            startActivity(Intent(this, CustomListView::class.java))
        }


        lvbutton2 = findViewById(R.id.button4)

        lvbutton2.setOnClickListener {

            startActivity(Intent(this, RecyclerView::class.java))
        }



    }
}
