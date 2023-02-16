package com.example.paylon.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.paylon.data.model.response.BeerListResponse
import com.example.paylon.data.repository.PaylonRepository
import com.example.paylon.ui.base.BaseViewModel
import com.example.paylon.utils.common.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
class SharedViewModel(val paylonRepository: PaylonRepository) : BaseViewModel() {

    //To add the child data value in live data
    private val _beerListLiveData = MutableLiveData<Resource<ArrayList<BeerListResponse>>>()
    val beerListLiveData = _beerListLiveData

    private val getPageCount: MutableLiveData<String> = MutableLiveData()


        fun fetchData() {
            val pageCount = getPageCount.value
            viewModelScope.launch(Dispatchers.IO) {
                val data = paylonRepository.fetchData("1","80")
                data.let {value ->
                    _beerListLiveData.postValue(value)
                }
            }
        }



    fun onPageCountChange(pageCount: String) {
        getPageCount.postValue(pageCount)
    }


}