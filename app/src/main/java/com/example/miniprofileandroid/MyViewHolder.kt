package com.example.miniprofileandroid

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    val lblInfo: TextView = itemView.findViewById(R.id.labelInfo)
    val btnArrow: Button = itemView.findViewById(R.id.arrowButton)
}