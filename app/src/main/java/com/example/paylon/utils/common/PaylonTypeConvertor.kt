package com.example.paylon.utils.common

import androidx.room.TypeConverter
import com.example.paylon.data.model.response.BeerListResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class PaylonTypeConvertor {

    @TypeConverter
    fun fromObjectToString(list: BeerListResponse?): String? {
        val gson = Gson()
        return gson.toJson(list)
    }

    @TypeConverter
    fun fromStringToObject(value: String?): BeerListResponse? {
        val listType: Type = object : TypeToken<BeerListResponse?>() {}.type
        return Gson().fromJson(value, listType)
    }

}