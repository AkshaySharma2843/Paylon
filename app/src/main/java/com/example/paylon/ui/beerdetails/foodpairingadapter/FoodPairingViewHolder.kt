package com.example.paylon.ui.beerdetails.foodpairingadapter

import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.databinding.ItemViewFoodPairingBinding

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class FoodPairingViewHolder(private val binding : ItemViewFoodPairingBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindData(arrayList: String, position: Int) {
        binding.tvName.text = arrayList
        binding.tvNo.text = "${position+1}."

    }

}