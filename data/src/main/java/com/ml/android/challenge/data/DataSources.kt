package com.ml.android.challenge.data

import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.domain.Episode
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single

interface RemoteCharacterDataSource {
    fun getAllCharacters(page: Int): Single<List<Character>>
}

interface LocalCharacterDataSource {

    fun getAllFavoriteCharacters(): Flowable<List<Character>>

    fun getFavoriteCharacterStatus(characterId: String): Maybe<Boolean>

    fun updateFavoriteCharacterStatus(character: Character): Maybe<Boolean>
}

interface RemoteEpisodeDataSource {
    fun getEpisodeFromCharacter(episodeUrlList: List<String>): Single<List<Episode>>
}
