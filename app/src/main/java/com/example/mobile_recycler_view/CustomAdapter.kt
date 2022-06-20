package com.example.mobile_recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val array: ArrayList<Mobile>):RecyclerView.Adapter<CustomAdapter.DataHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {

        val dataHolder = DataHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_layout,parent,false))
        return dataHolder
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
        val mobile:Mobile = array[position]
        holder.imageView.setImageResource(mobile.image)
        holder.name.text = mobile.name
        holder.desc.text = mobile.desc
    }

    override fun getItemCount(): Int {
        return array.size
    }

class DataHolder(view: View):RecyclerView.ViewHolder(view){
    val imageView :ImageView = view.findViewById(R.id.mobile)
    val name:TextView = view.findViewById(R.id.name)
    val desc:TextView = view.findViewById(R.id.description)
}

}