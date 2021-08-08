package com.ml.android.challenge.parcelables

import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.domain.Location
import com.ml.android.challenge.domain.Origin

fun Character.toCharacterParcelable() = CharacterParcelable(
    id,
    name,
    image,
    gender,
    species,
    status,
    origin.toOriginParcelable(),
    location.toLocationParcelable(),
    episodeList
)

fun Location.toLocationParcelable() = LocationParcelable(
    name,
    url
)

fun Origin.toOriginParcelable() = OriginParcelable(
    state_id,
    state_name
)

fun CharacterParcelable.toCharacterDomain() = Character(
    id,
    name,
    image,
    gender,
    species,
    status,
    origin.toOriginDomain(),
    location.toLocationDomain(),
    episodeList
)

fun LocationParcelable.toLocationDomain() = Location(
    name,
    url
)

fun OriginParcelable.toOriginDomain() = Origin(
    site_id,
    state_name
)
