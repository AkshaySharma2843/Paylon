package com.example.paylon.ui.beerdetails.hopsadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.data.model.beerlist.Hop
import com.example.paylon.databinding.ItemViewHopsBinding

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class HopsAdapter(private val list : ArrayList<Hop>) : RecyclerView.Adapter<HopsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HopsViewHolder {
        return HopsViewHolder(ItemViewHopsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: HopsViewHolder, position: Int) {

        val arrayList : Hop = list[position]
        holder.bindData(arrayList,position)
    }

    override fun getItemCount(): Int = list.size
}