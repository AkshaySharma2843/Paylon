package com.example.paylon.data.model.beerlist

import androidx.room.TypeConverters
import com.example.paylon.utils.common.PaylonTypeConvertor
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
@TypeConverters(PaylonTypeConvertor::class)
data class Volume(

    @SerializedName("value")
    @Expose
    val  value : String?=null,

    @SerializedName("unit")
    @Expose
    val  unit : String?=null
): Serializable