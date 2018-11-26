package com.kotlin.intermediatetask.kotlinintermediatetask.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.kotlin.intermediatetask.kotlinintermediatetask.R
import android.support.v7.widget.RecyclerView
import com.kotlin.intermediatetask.kotlinintermediatetask.adapter.employeeadapter
import com.kotlin.intermediatetask.kotlinintermediatetask.model.employee

class RecyclerView : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.setHasFixedSize(true)
        val emplist = ArrayList<employee>()

        emplist.add(employee("Nayeem Shiddiki Abir", "Lead Software Engineer",R.drawable.emp3))
        emplist.add(employee("Muhaimanul Chowdhury Ramim", "Sinior Software Engineer",R.drawable.emp3))
        emplist.add(employee("Saida Tasneem Shanta", "junior Software Engineer",R.drawable.emp3))
        emplist.add(employee("Anwar Hossain Bapppy", "junior Software Engineer",R.mipmap.ic_launcher))

        val adapter = employeeadapter(emplist,this)
        recyclerView.adapter = adapter

        }
}

