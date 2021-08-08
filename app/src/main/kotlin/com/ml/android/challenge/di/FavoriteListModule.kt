package com.ml.android.challenge.di

import com.ml.android.challenge.presentation.FavoriteListViewModel
import com.ml.android.challenge.usecases.GetAllFavoriteCharactersUseCase
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Module
class FavoriteListModule {

    @Provides
    fun favoriteListViewModelProvider(
        getAllFavoriteCharactersUseCase: GetAllFavoriteCharactersUseCase
    ) = FavoriteListViewModel(
        getAllFavoriteCharactersUseCase
    )
}

@Subcomponent(modules = [(FavoriteListModule::class)])
interface FavoriteListComponent {
    val favoriteListViewModel: FavoriteListViewModel
}
