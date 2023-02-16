package com.example.paylon.data.network

import com.example.paylon.data.model.response.BeerListResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Akshay Sharma on 14-02-2023.
 */

interface NetworkService {

    @GET(Endpoints.BEER_LIST)
    suspend fun getBeerList(@Query("page") page:String?, @Query("per_page") count :String) : ArrayList<BeerListResponse>



}