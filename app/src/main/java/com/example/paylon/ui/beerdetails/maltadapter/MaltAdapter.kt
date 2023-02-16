package com.example.paylon.ui.beerdetails.maltadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.paylon.data.model.beerlist.Malt
import com.example.paylon.databinding.ItemViewMaltBinding

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class MaltAdapter(private val list : ArrayList<Malt>) : RecyclerView.Adapter<MaltViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MaltViewHolder {
        return MaltViewHolder(ItemViewMaltBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MaltViewHolder, position: Int) {
        val arrayList : Malt = list[position]
        holder.bindData(arrayList,position)

    }

    override fun getItemCount(): Int = list.size
}