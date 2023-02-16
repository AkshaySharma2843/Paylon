package com.example.paylon.ui.beerdetails.maltadapter

import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.data.model.beerlist.Malt
import com.example.paylon.databinding.ItemViewMaltBinding

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class MaltViewHolder(private val binding : ItemViewMaltBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindData(arrayList: Malt, position: Int) {

        binding.tvMaltNameDetails.text = arrayList.name
        binding.tvMaltValueDetails.text = arrayList.amount?.value
        binding.tvMaltUnitDetails.text = arrayList.amount?.unit
        val no = position+1
        binding.tvNo.text = "No. $no"

    }

}