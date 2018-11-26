package com.kotlin.intermediatetask.kotlinintermediatetask.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.kotlin.intermediatetask.kotlinintermediatetask.R


// This technique no need to use model class

class languageadapter (
    private val context: Activity,
    private val Name: Array<String>,
    private val Designation: Array<String>,
    private val Image: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.custom_layout, Name) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_layout, null, true)

        val IMAGE = rowView.findViewById(R.id.imageview) as ImageView
        val NAME = rowView.findViewById(R.id.name) as TextView
        val DESIGNATION = rowView.findViewById(R.id.desig) as TextView

        IMAGE.setImageResource(Image[position])
        NAME.text = Name[position]
        DESIGNATION.text = Designation[position]

        return rowView
    }


}