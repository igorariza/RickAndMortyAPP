package com.ml.android.challenge.usecases

import com.ml.android.challenge.data.CharacterRepository
import com.ml.android.challenge.data.EpisodeRepository
import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.domain.Episode
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single

class GetAllCharactersUseCase(
    private val characterRepository: CharacterRepository
) {

    fun invoke(currentPage: Int): Single<List<Character>> =
        characterRepository.getAllCharacters(currentPage)
}

class GetAllFavoriteCharactersUseCase(
    private val characterRepository: CharacterRepository
) {

    fun invoke(): Flowable<List<Character>> = characterRepository.getAllFavoriteCharacters()
}

class GetEpisodeFromCharacterUseCase(
    private val episodeRepository: EpisodeRepository
) {

    fun invoke(episodeUrlList: List<String>): Single<List<Episode>> =
        episodeRepository.getEpisodeFromCharacter(episodeUrlList)
}

class GetFavoriteCharacterStatusUseCase(
    private val characterRepository: CharacterRepository
) {

    fun invoke(characterId: String): Maybe<Boolean> =
        characterRepository.getFavoriteCharacterStatus(characterId)
}

class UpdateFavoriteCharacterStatusUseCase(
    private val characterRepository: CharacterRepository
) {

    fun invoke(character: Character): Maybe<Boolean> =
        characterRepository.updateFavoriteCharacterStatus(character)
}
