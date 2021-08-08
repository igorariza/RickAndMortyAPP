package com.ml.android.challenge.data

import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.domain.Episode
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single

class CharacterRepository(
    private val remoteCharacterDataSource: RemoteCharacterDataSource,
    private val localCharacterDataSource: LocalCharacterDataSource
) {

    //region Public Methods

    fun getAllCharacters(page: Int): Single<List<Character>> =
        remoteCharacterDataSource.getAllCharacters(page)

    fun getAllFavoriteCharacters(): Flowable<List<Character>> =
        localCharacterDataSource.getAllFavoriteCharacters()

    fun getFavoriteCharacterStatus(characterId: String): Maybe<Boolean> =
        localCharacterDataSource.getFavoriteCharacterStatus(characterId)

    fun updateFavoriteCharacterStatus(character: Character): Maybe<Boolean> =
        localCharacterDataSource.updateFavoriteCharacterStatus(character)

    //endregion
}

class EpisodeRepository(
    private val remoteEpisodeDataSource: RemoteEpisodeDataSource
) {

    //region Public Methods

    fun getEpisodeFromCharacter(episodeUrlList: List<String>): Single<List<Episode>> =
        remoteEpisodeDataSource.getEpisodeFromCharacter(episodeUrlList)

    //endregion
}
