package com.example.paylon.data.model.beerlist

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
data class MashTemp(
    @SerializedName("temp")
    @Expose
    val temp :Temp?=null,

    @SerializedName("duration")
    @Expose
    val duration :String?=null
): Serializable