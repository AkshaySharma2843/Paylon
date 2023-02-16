package com.example.paylon.ui.beerdetails.meshtempadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.data.model.beerlist.MashTemp
import com.example.paylon.databinding.ItemViewMeshTempBinding

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class MeshTempAdapter(val list : ArrayList<MashTemp>) : RecyclerView.Adapter<MeshTempViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeshTempViewHolder {
        return MeshTempViewHolder(ItemViewMeshTempBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MeshTempViewHolder, position: Int) {
        val arrayList : MashTemp = list[position]
        holder.bindData(arrayList,position)

    }

    override fun getItemCount(): Int = list.size

}