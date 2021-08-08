package com.ml.android.challenge.di

import com.ml.android.challenge.presentation.CharacterListViewModel
import com.ml.android.challenge.usecases.GetAllCharactersUseCase
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Module
class CharacterListModule {

    @Provides
    fun characterListViewModelProvider(
        getAllCharactersUseCase: GetAllCharactersUseCase
    ) = CharacterListViewModel(
        getAllCharactersUseCase
    )
}

@Subcomponent(modules = [(CharacterListModule::class)])
interface CharacterListComponent {
    val characterListViewModel: CharacterListViewModel
}
