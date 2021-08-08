package com.ml.android.challenge.requestmanager

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.ml.android.challenge.requestmanager.APIConstants.KEY_EPISODE
import com.ml.android.challenge.requestmanager.APIConstants.KEY_GENDER
import com.ml.android.challenge.requestmanager.APIConstants.KEY_RESULTS
import com.ml.android.challenge.requestmanager.APIConstants.KEY_ID
import com.ml.android.challenge.requestmanager.APIConstants.KEY_IMAGE
import com.ml.android.challenge.requestmanager.APIConstants.KEY_LOCATION
import com.ml.android.challenge.requestmanager.APIConstants.KEY_NAME
import com.ml.android.challenge.requestmanager.APIConstants.KEY_ORIGIN
import com.ml.android.challenge.requestmanager.APIConstants.KEY_SPECIES
import com.ml.android.challenge.requestmanager.APIConstants.KEY_STATUS
import com.ml.android.challenge.requestmanager.APIConstants.KEY_URL
import kotlinx.android.parcel.Parcelize

data class CharacterResponseServer(
    @SerializedName(KEY_RESULTS) val results: List<CharacterServer>
)

@Parcelize
data class CharacterServer(
    @SerializedName(KEY_ID) val id: String,
    @SerializedName(KEY_NAME) val title: String,
    @SerializedName(KEY_IMAGE) val thumbnail: String?,
    @SerializedName(KEY_GENDER) val site_id: String,
    @SerializedName(KEY_SPECIES) val power_seller_status: String,
    @SerializedName(KEY_STATUS) val price: String,
    @SerializedName(KEY_ORIGIN) val origin: OriginServer,
    @SerializedName(KEY_LOCATION) val address: LocationServer,
    @SerializedName(KEY_EPISODE) val tagsList: List<String>
): Parcelable

@Parcelize
data class LocationServer(
    @SerializedName(KEY_NAME) val name: String,
    @SerializedName(KEY_URL) val permalink: String
): Parcelable

@Parcelize
data class OriginServer(
    @SerializedName(KEY_NAME) val state_id: String,
    @SerializedName(KEY_URL) val state_name: String
): Parcelable

data class EpisodeServer(
    @SerializedName(KEY_ID) val id: String,
    @SerializedName(KEY_NAME) val name: String
)
