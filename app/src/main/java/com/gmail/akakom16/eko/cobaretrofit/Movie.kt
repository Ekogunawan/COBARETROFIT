package com.gmail.akakom16.eko.cobaretrofit

import com.google.gson.annotations.SerializedName

data class Movie(@SerializedName("original_title") val originalTitle : String?,
                 @SerializedName("overview") val overview : String?,
                 @SerializedName("poster_path") val posterPath : String?)