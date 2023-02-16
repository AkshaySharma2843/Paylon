package com.example.paylon.data.repository

import com.example.paylon.data.model.response.BeerListResponse
import com.example.paylon.data.network.NetworkService
import com.example.paylon.utils.common.Resource
import com.example.paylon.utils.network.NetworkHelper
import javax.inject.Inject

/**
 * Created by Akshay Sharma on 14-02-2023.
 */
class PaylonRepository @Inject constructor(
    private val networkService: NetworkService,
    private val networkHelper: NetworkHelper) {

    suspend fun fetchData(
        page_no : String?,
        count : String?
    ) : Resource<ArrayList<BeerListResponse>> {
        return if(networkHelper.isNetworkAvailable()){
            val data = count?.let { networkService.getBeerList(page_no, it) }
            return Resource.success(data)
        }else{
            return Resource.error()
        }
    }


}