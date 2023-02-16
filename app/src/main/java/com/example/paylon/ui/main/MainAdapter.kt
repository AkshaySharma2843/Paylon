package com.example.paylon.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.data.model.response.BeerListResponse
import com.example.paylon.databinding.ItemViewBeerListBinding

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
class MainAdapter(private val list : ArrayList<BeerListResponse>, private val postClickListener: PostClickListener) : RecyclerView.Adapter<MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(ItemViewBeerListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val arrayList : BeerListResponse = list[position]
        holder.bindData(arrayList,position,postClickListener)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}