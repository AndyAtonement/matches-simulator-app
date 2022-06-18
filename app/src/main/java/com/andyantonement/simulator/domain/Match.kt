package com.andyantonement.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match (
    @SerializedName("description")
    val description: String,
    @SerializedName("place")
    val place: Place,
    @SerializedName("homeTeam")
    val homeTeam: Team,
    @SerializedName("awayTeam")
    val awayTeam: Team
)