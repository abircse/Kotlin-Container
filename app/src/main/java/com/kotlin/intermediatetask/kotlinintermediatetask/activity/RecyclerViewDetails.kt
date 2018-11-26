package com.kotlin.intermediatetask.kotlinintermediatetask.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.kotlin.intermediatetask.kotlinintermediatetask.R
import com.squareup.picasso.Picasso

class RecyclerViewDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_details)

        val bundle:Bundle = intent.extras
        val image = bundle.get("image")
        val name = bundle.get("name")
        val address = bundle.get("address")

        val MYIMAGE: ImageView = findViewById(R.id.imageView1)
        val MYNAME: TextView = findViewById(R.id.textView1)
        var MYADDRESS: TextView = findViewById(R.id.textView2)

        Picasso.with(this).load(image.toString()).into(MYIMAGE)
        MYIMAGE.setImageResource(image as Int)
        MYNAME.text = name.toString()
        MYADDRESS.text = address.toString()
    }
}


