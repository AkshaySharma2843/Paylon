package com.example.paylon.ui.main

import com.example.paylon.data.model.response.BeerListResponse

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
interface PostClickListener {

    fun onPostClickListener (beerListResponse: BeerListResponse, position : Int) {
        
    }
}