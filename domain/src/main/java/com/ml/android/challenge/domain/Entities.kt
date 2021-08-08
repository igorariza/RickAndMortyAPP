package com.ml.android.challenge.domain

data class Character(
    val id: String,
    val name: String,
    val image: String?,
    val gender: String,
    val species: String,
    val status: String,
    val origin: Origin,
    val location: Location,
    val episodeList: List<String>
)

data class Location(
    val name: String,
    val url: String
)

data class Origin(
    val state_id: String,
    val state_name: String
)

data class Episode(
    val id: String,
    val name: String
)
