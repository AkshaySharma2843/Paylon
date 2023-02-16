package com.example.paylon.data.model.beerlist

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
data class Ingredients(

    @SerializedName("malt")
    @Expose
    val malt : ArrayList<Malt>?=null,

    @SerializedName("hops")
    @Expose
    val hops : ArrayList<Hop>?=null,

    @SerializedName("yeast")
    @Expose
    val yeast : String?=null
): Serializable
