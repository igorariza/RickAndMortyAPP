package com.ml.android.challenge.di

import com.ml.android.challenge.domain.Character
import com.ml.android.challenge.presentation.CharacterDetailViewModel
import com.ml.android.challenge.usecases.GetEpisodeFromCharacterUseCase
import com.ml.android.challenge.usecases.GetFavoriteCharacterStatusUseCase
import com.ml.android.challenge.usecases.UpdateFavoriteCharacterStatusUseCase
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Module
class CharacterDetailModule(
    private val character: Character?
) {

    @Provides
    fun characterDetailViewModelProvider(
        getEpisodeFromCharacterUseCase: GetEpisodeFromCharacterUseCase,
        getFavoriteCharacterStatusUseCase: GetFavoriteCharacterStatusUseCase,
        updateFavoriteCharacterStatusUseCase: UpdateFavoriteCharacterStatusUseCase
    ) = CharacterDetailViewModel(
        character,
        getEpisodeFromCharacterUseCase,
        getFavoriteCharacterStatusUseCase,
        updateFavoriteCharacterStatusUseCase
    )
}

@Subcomponent(modules = [(CharacterDetailModule::class)])
interface CharacterDetailComponent {
    val characterDetailViewModel: CharacterDetailViewModel
}
