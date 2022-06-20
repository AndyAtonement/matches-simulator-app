package com.andyantonement.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match (
    @SerializedName("description")
    val description: String,
    @SerializedName("place")
    val place: Place,
    @SerializedName("homeTeam")
    val homeTeam: Team,
    @SerializedName("awayTeam")
    val awayTeam: Team
) : Parcelable