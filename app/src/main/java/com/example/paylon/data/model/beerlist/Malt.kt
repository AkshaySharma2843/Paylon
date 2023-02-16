package com.example.paylon.data.model.beerlist

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
data class Malt(

    @SerializedName("name")
    @Expose
    val name :String?=null,

    @SerializedName("amount")
    @Expose
    val amount : MaltAmount?=null
): Serializable
