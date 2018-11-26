package com.kotlin.intermediatetask.kotlinintermediatetask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.kotlin.intermediatetask.kotlinintermediatetask.R
import com.kotlin.intermediatetask.kotlinintermediatetask.model.engineer


// This techniq need to use model class
class engineeradapterdemowithbaseadapter(private val context: Context, private val engineerlist: ArrayList<engineer>) : BaseAdapter() {

    override fun getViewTypeCount(): Int {
        return count
    }

    override fun getItemViewType(position: Int): Int {

        return position
    }

    override fun getCount(): Int {
        return engineerlist.size
    }

    override fun getItem(position: Int): Any {
        return engineerlist[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder

        if (convertView == null) {
            holder = ViewHolder()
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.custom_layout, null, true)

            holder.IMAGEVIEW = convertView.findViewById(R.id.imageview) as ImageView
            holder.NAME = convertView!!.findViewById(R.id.name) as TextView
            holder.DESIGNATION = convertView!!.findViewById(R.id.desig) as TextView


            convertView.tag = holder
        } else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = convertView.tag as ViewHolder
        }

        holder.IMAGEVIEW!!.setImageResource(engineerlist[position].image)
        holder.NAME!!.setText(engineerlist[position].name)
        holder.DESIGNATION!!.setText(engineerlist[position].designation)


        return convertView
    }

    private inner class ViewHolder {

        var DESIGNATION: TextView? = null
        var NAME: TextView? = null
        internal var IMAGEVIEW: ImageView? = null

    }

}