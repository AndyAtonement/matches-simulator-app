package com.andyantonement.simulator.domain

import com.google.gson.annotations.SerializedName

data class Team (
    @SerializedName("name")
    val name: String,
    @SerializedName("stars")
    val stars: Int,
    @SerializedName("image")
    val image: String
    )