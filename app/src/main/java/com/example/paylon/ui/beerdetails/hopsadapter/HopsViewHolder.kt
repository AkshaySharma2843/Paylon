package com.example.paylon.ui.beerdetails.hopsadapter

import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.data.model.beerlist.Hop
import com.example.paylon.databinding.ItemViewHopsBinding

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class HopsViewHolder(private val binding : ItemViewHopsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindData(arrayList: Hop, position: Int) {

        binding.tvMaltNameDetails.text = arrayList.name
        binding.tvMaltValueDetails.text = arrayList.hopsAmount?.value
        binding.tvMaltUnitDetails.text = arrayList.hopsAmount?.unit
        binding.tvMaltAddDetails.text = arrayList.add
        binding.tvMaltAttributeDetails.text = arrayList.attribute
        val no = position+1
        binding.tvNo.text = "No. $no"


    }

}