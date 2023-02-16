package com.example.paylon.utils.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Akshay Sharma on 14-02-2023.
 */
data class NetworkError (
    val status : Int = -1,

    @SerializedName("statusCode")
    @Expose
    val statusCode : String = "-1",

    @SerializedName("message")
    @Expose
    val message : String = "Something Went Wrong"
    )