package com.example.blume

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val jasaList : ArrayList<Jasa>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = jasaList[position]
        holder.namaJasa.text = currentItem.namaJasa
        holder.harga.text = "Rp. "+currentItem.harga+",-"
    }

    override fun getItemCount(): Int {
        return jasaList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val namaJasa : TextView = itemView.findViewById(R.id.tv_itemName)
        val harga : TextView = itemView.findViewById(R.id.tv_itemPrice)
    }

}