package com.example.paylon.ui.beerdetails.meshtempadapter

import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.data.model.beerlist.MashTemp
import com.example.paylon.databinding.ItemViewMeshTempBinding

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class MeshTempViewHolder(private val binding : ItemViewMeshTempBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindData(arrayList: MashTemp, position: Int) {
        val no = position+1
        binding.tvNo.text = "No. $no"
        binding.tvMeshTempUnitDetails.text = arrayList.temp?.unit
        binding.tvMeshTempValueDetails.text = arrayList.temp?.value
        binding.tvMeshTempDurationDetails.text = arrayList.duration


    }

}