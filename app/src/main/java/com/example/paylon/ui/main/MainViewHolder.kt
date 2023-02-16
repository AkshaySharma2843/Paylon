package com.example.paylon.ui.main

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.paylon.data.model.response.BeerListResponse
import com.example.paylon.databinding.ItemViewBeerListBinding

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
class MainViewHolder(private val binding: ItemViewBeerListBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindData(arrayList: BeerListResponse, position: Int, postClickListener: PostClickListener) {
        binding.tvBeerNameDetails.text = arrayList.name
        binding.tvTagline.text = arrayList.tagline
        Glide.with(itemView)
            .load(arrayList.image_url)
            .into(binding.ivBeerImage)
        itemView.setOnClickListener {
            postClickListener.onPostClickListener(arrayList,position)
        }
    }

}
