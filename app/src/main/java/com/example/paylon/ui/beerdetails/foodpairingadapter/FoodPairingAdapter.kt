package com.example.paylon.ui.beerdetails.foodpairingadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.databinding.ItemViewFoodPairingBinding

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class FoodPairingAdapter(private val list : ArrayList<String>) : RecyclerView.Adapter<FoodPairingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodPairingViewHolder {
        return FoodPairingViewHolder(ItemViewFoodPairingBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: FoodPairingViewHolder, position: Int) {
        val arrayList : String = list[position]
        holder.bindData(arrayList,position)
    }

    override fun getItemCount(): Int = list.size
}