package com.example.miniprofileandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MyAdapter (
    private val items: List<String>,
    private val onClick: (String) -> Unit): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.settings_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.lblInfo.text = items[position]
        holder.btnArrow.setOnClickListener { onClick(items[position]) }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}