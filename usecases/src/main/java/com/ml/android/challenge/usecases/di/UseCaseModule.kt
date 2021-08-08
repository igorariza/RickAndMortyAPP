package com.ml.android.challenge.usecases.di

import com.ml.android.challenge.data.CharacterRepository
import com.ml.android.challenge.data.EpisodeRepository
import com.ml.android.challenge.usecases.*
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun getAllCharacterUseCaseProvider(characterRepository: CharacterRepository) =
        GetAllCharactersUseCase(characterRepository)

    @Provides
    fun getAllFavoriteCharactersUseCaseProvider(characterRepository: CharacterRepository) =
        GetAllFavoriteCharactersUseCase(characterRepository)

    @Provides
    fun getFavoriteCharacterStatusUseCaseProvider(characterRepository: CharacterRepository) =
        GetFavoriteCharacterStatusUseCase(characterRepository)

    @Provides
    fun updateFavoriteCharacterStatusUseCaseProvider(characterRepository: CharacterRepository) =
        UpdateFavoriteCharacterStatusUseCase(characterRepository)

    @Provides
    fun getEpisodeFromCharacterUseCaseProvider(episodeRepository: EpisodeRepository) =
        GetEpisodeFromCharacterUseCase(episodeRepository)
}
