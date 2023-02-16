package com.example.paylon.data.model.response

import com.example.paylon.data.model.beerlist.BoilVolume
import com.example.paylon.data.model.beerlist.Ingredients
import com.example.paylon.data.model.beerlist.Method
import com.example.paylon.data.model.beerlist.Volume
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Akshay Sharma on 15-02-2023.
 */

data class BeerListResponse(

    @SerializedName("id")
    @Expose
    val id : String? =null,

    @SerializedName("name")
    @Expose
    val name : String?=null,

    @SerializedName("tagline")
    @Expose
    val tagline : String?=null,

    @SerializedName("first_brewed")
    @Expose
    val firstBrewed : String?=null,

    @SerializedName("description")
    @Expose
    val description : String?=null,

    @SerializedName("image_url")
    @Expose
    val image_url : String?=null,

    @SerializedName("abv")
    @Expose
    val abv : String?=null,

    @SerializedName("ibu")
    @Expose
    val ibu : String?=null,

    @SerializedName("target_fg")
    @Expose
    val target_fg : String?=null,

    @SerializedName("target_og")
    @Expose
    val target_og : String?=null,

    @SerializedName("ebc")
    @Expose
    val ebc : String?=null,

    @SerializedName("srm")
    @Expose
    val srm : String?=null,

    @SerializedName("ph")
    @Expose
    val ph : String?=null,

    @SerializedName("attenuation_level")
    @Expose
    val attenuationLevel : String?=null,

    @SerializedName("volume")
    @Expose
    val volume : Volume?=null,

    @SerializedName("boil_volume")
    @Expose
    val boilVolume : BoilVolume?=null,

    @SerializedName("method")
    @Expose
    val method : Method?=null,

    @SerializedName("ingredients")
    @Expose
    val ingredients : Ingredients?=null,

    @SerializedName("food_pairing")
    @Expose
    val food_pairing : ArrayList<String>?=null,

    @SerializedName("brewers_tips")
    @Expose
    val brewers_tips : String?=null,

    @SerializedName("contributed_by")
    @Expose
    val contributed_by : String?=null
) : Serializable