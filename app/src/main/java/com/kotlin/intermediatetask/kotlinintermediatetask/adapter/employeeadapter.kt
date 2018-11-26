package com.kotlin.intermediatetask.kotlinintermediatetask.adapter

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kotlin.intermediatetask.kotlinintermediatetask.R
import com.kotlin.intermediatetask.kotlinintermediatetask.model.employee
import android.telecom.Call.Details
import android.content.Intent
import com.kotlin.intermediatetask.kotlinintermediatetask.activity.RecyclerViewDetails
import com.squareup.picasso.Picasso


class employeeadapter (val employeelist: ArrayList<employee>, val context: Context) : RecyclerView.Adapter<employeeadapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val v = LayoutInflater.from(p0.context).inflate(R.layout.custom_recycler, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return employeelist.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.bindItems(employeelist[p1])
        p0.itemView.setOnClickListener {

            val image = employeelist.get(p1).image
            val name = employeelist.get(p1).name
            val address = employeelist.get(p1).address
            val a = Intent(context, RecyclerViewDetails::class.java)
            a.putExtra("image", image)
            a.putExtra("name", name)
            a.putExtra("address", address)
            context.startActivity(a)

        }

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(emplo: employee)
        {

            val img = itemView.findViewById(R.id.imageviewuser) as ImageView
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress  = itemView.findViewById(R.id.textViewAddress) as TextView

            Picasso.with(itemView.context).load(emplo.image).into(img)
            img.setImageResource(emplo.image)
            textViewName.text = emplo.name
            textViewAddress.text = emplo.address
        }


    }
}