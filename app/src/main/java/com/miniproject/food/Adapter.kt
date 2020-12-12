package com.miniproject.food

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class Adapter( var mCtx: Context, var resource: Int, var items: List<Model>): ArrayAdapter<Model>(mCtx,resource,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resource,null)

         val imageView_resturant:ImageView = view.findViewById(R.id.imageView_resturant)
         val hotelName_textView: TextView= view.findViewById(R.id.hotelName_textView)
         val costForTwo_textView: TextView= view.findViewById(R.id.costForTwo_textView)

        var mItem:Model = items[position]
        imageView_resturant.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        hotelName_textView.text = mItem.title
        costForTwo_textView.text = mItem.des

        return view
    }
}