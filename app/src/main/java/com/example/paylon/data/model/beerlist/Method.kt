package com.example.paylon.data.model.beerlist

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
data class Method(

    @SerializedName("mash_temp")
    @Expose
    val mashTemp : ArrayList<MashTemp>?=null,

    @SerializedName("fermentation")
    @Expose
    val fermentation : Fermentation?=null,

    @SerializedName("twist")
    @Expose
    val twist : String?=null
): Serializable