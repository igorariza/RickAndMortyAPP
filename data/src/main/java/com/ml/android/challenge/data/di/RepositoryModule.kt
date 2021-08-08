package com.ml.android.challenge.data.di

import com.ml.android.challenge.data.*
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun characterRepositoryProvider(
        remoteCharacterDataSource: RemoteCharacterDataSource,
        localCharacterDataSource: LocalCharacterDataSource
    ) = CharacterRepository(
        remoteCharacterDataSource,
        localCharacterDataSource
    )

    @Provides
    fun episodeRepositoryProvider(
        remoteEpisodeDataSource: RemoteEpisodeDataSource
    ) = EpisodeRepository(
        remoteEpisodeDataSource
    )
}
