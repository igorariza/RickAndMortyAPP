package com.ml.android.challenge.di

import android.app.Application
import com.ml.android.challenge.data.di.RepositoryModule
import com.ml.android.challenge.databasemanager.di.DatabaseModule
import com.ml.android.challenge.requestmanager.di.APIModule
import com.ml.android.challenge.usecases.di.UseCaseModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    APIModule::class,
    DatabaseModule::class,
    RepositoryModule::class,
    UseCaseModule::class
])
interface ChallengeMLComponent {

    fun inject(module: CharacterListModule): CharacterListComponent
    fun inject(module: FavoriteListModule): FavoriteListComponent
    fun inject(module: CharacterDetailModule): CharacterDetailComponent

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): ChallengeMLComponent
    }
}
