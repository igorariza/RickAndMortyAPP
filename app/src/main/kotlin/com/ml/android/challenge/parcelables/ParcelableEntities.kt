package com.ml.android.challenge.parcelables

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterParcelable(
    val id: String,
    val name: String,
    val image: String?,
    val gender: String,
    val species: String,
    val status: String,
    val origin: OriginParcelable,
    val location: LocationParcelable,
    val episodeList: List<String>
): Parcelable

@Parcelize
data class OriginParcelable(
    val site_id: String,
    val state_name: String
): Parcelable

@Parcelize
data class LocationParcelable(
    val name: String,
    val url: String
): Parcelable
