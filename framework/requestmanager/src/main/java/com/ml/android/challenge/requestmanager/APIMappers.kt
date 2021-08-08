package com.ml.android.challenge.requestmanager

import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.domain.Episode
import com.ml.android.challenge.domain.Location
import com.ml.android.challenge.domain.Origin

fun CharacterResponseServer.toCharacterDomainList(): List<Character> = results.map {
    it.run{
        Character(
            id,
            title,
            thumbnail,
            site_id,
            power_seller_status,
            price,
            origin.toOriginDomain(),
            address.toLocationDomain(),
            tagsList.map { tags -> "$tags/" }
        )
    }
}

fun OriginServer.toOriginDomain() = Origin(
    state_id,
    state_name
)

fun LocationServer.toLocationDomain() = Location(
    name,
    permalink
)

fun EpisodeServer.toEpisodeDomain() = Episode(
    id,
    name
)
