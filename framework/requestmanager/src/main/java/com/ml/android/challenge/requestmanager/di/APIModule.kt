package com.ml.android.challenge.requestmanager.di

import com.ml.android.challenge.data.RemoteCharacterDataSource
import com.ml.android.challenge.data.RemoteEpisodeDataSource
import com.ml.android.challenge.requestmanager.APIConstants.BASE_API_URL
import com.ml.android.challenge.requestmanager.CharacterRequest
import com.ml.android.challenge.requestmanager.CharacterRetrofitDataSource
import com.ml.android.challenge.requestmanager.EpisodeRequest
import com.ml.android.challenge.requestmanager.EpisodeRetrofitDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class APIModule {

    @Provides
    fun characterRequestProvider(
        @Named("baseUrl") baseUrl: String
    ) = CharacterRequest(baseUrl)

    @Provides
    @Singleton
    @Named("baseUrl")
    fun baseUrlProvider(): String = BASE_API_URL

    @Provides
    fun remoteCharacterDataSourceProvider(
        characterRequest: CharacterRequest
    ): RemoteCharacterDataSource = CharacterRetrofitDataSource(characterRequest)

    @Provides
    fun episodeRequestProvider(
        @Named("baseUrl") baseUrl: String
    ) = EpisodeRequest(baseUrl)

    @Provides
    fun remoteEpisodeDataSourceProvider(
        episodeRequest: EpisodeRequest
    ): RemoteEpisodeDataSource = EpisodeRetrofitDataSource(episodeRequest)
}
