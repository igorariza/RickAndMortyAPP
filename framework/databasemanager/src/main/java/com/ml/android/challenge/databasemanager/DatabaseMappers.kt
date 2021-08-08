package com.ml.android.challenge.databasemanager

import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.domain.Location
import com.ml.android.challenge.domain.Origin

fun List<CharacterEntity>.toCharacterDomainList() = map(CharacterEntity::toCharacterDomain)

fun CharacterEntity.toCharacterDomain() = Character(
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

fun OriginEntity.toOriginDomain() = Origin(
    originPeriod,
    originCompleted
)

fun LocationEntity.toLocationDomain() = Location(
    locationName,
    locationUrl
)

fun Character.toCharacterEntity() = CharacterEntity(
    id,
    name,
    image,
    gender,
    species,
    status,
    origin.toOriginEntity(),
    location.toLocationEntity(),
    episodeList
)

fun Origin.toOriginEntity() = OriginEntity(
    state_id,
    state_name
)

fun Location.toLocationEntity() = LocationEntity(
    name,
    url
)
