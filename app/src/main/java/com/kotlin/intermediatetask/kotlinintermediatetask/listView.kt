package com.kotlin.intermediatetask.kotlinintermediatetask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView

class listView : AppCompatActivity() {



    lateinit var lv: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        lv = findViewById(R.id.mylistview)
        lv.divider = null

        var listitem = resources.getStringArray(R.array.country)
        var Adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listitem)
        lv.adapter = Adapter



    }
}
