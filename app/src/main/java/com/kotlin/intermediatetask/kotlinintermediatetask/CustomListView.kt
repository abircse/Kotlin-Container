package com.kotlin.intermediatetask.kotlinintermediatetask

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.kotlin.intermediatetask.kotlinintermediatetask.adapter.languageadapter

class CustomListView : AppCompatActivity() {

    val language = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")
    val description = arrayOf<String>(
        "C programming is considered as the base for other programming languages",
        "C++ is an object-oriented programming language.",
        "Java is a programming language and a platform.",
        ".NET is a framework which is used to develop software applications.",
        "Kotlin is a open-source programming language, used to develop Android apps and much more.",
        "Ruby is an open-source and fully object-oriented programming language.",
        "Ruby on Rails is a server-side web application development framework written in Ruby language.",
        "Python is interpreted scripting  and object-oriented programming language.",
        "JavaScript is an object-based scripting language.",
        "PHP is an interpreted language, i.e., there is no need for compilation.",
        "AJAX allows you to send and receive data asynchronously without reloading the web page.",
        "Perl is a cross-platform environment used to create network and server-side applications.",
        "Hadoop is an open source framework from Apache written in Java."
    )

    val imageId = arrayOf<Int>(
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round,
        R.mipmap.ic_launcher_round

    )

    lateinit var lv: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        lv = findViewById(R.id.mylistc)

        val myAdapter = languageadapter(this,language,description,imageId)
        lv.adapter = myAdapter

        lv.setOnItemClickListener { parent, view, position, id ->

            // first line is to get NAME which already set into adapter
            val itemAtPos = parent.getItemAtPosition(position)
            // Second line is to get position id
            val itemIdAtPos = parent.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()

           intent = Intent(this, CustomListViewDetails::class.java)
            intent.putExtra("image", imageId[position])
            intent.putExtra("name", language[position])
            intent.putExtra("description", description[position])
            startActivity(intent)



        }




    }
}
