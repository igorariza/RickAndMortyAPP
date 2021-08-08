package com.ml.android.challenge.databasemanager.di

import android.app.Application
import com.ml.android.challenge.data.LocalCharacterDataSource
import com.ml.android.challenge.databasemanager.CharacterDatabase
import com.ml.android.challenge.databasemanager.CharacterRoomDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun databaseProvider(app: Application): CharacterDatabase = CharacterDatabase.getDatabase(app)

    @Provides
    fun localCharacterDataSourceProvider(
        database: CharacterDatabase
    ): LocalCharacterDataSource = CharacterRoomDataSource(database)
}
