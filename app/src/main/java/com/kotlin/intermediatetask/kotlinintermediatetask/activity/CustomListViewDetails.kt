package com.kotlin.intermediatetask.kotlinintermediatetask.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.kotlin.intermediatetask.kotlinintermediatetask.R

class CustomListViewDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view_details)

        val bundle:Bundle = intent.extras
        val image = bundle.get("image")
        val name = bundle.get("name")
        val description = bundle.get("description")

        val myimage: ImageView = findViewById(R.id.imageView1)
        val myname: TextView = findViewById(R.id.textView1)
        var mydescription: TextView = findViewById(R.id.textView2)

        myimage.setImageResource(image as Int)
        myname.text = name.toString()
        mydescription.text = description.toString()



    }
}
