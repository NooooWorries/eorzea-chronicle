package com.czxbnb.eorzea.di

import com.czxbnb.eorzea.api.CharacterApi
import com.czxbnb.eorzea.database.CharacterDao
import com.czxbnb.eorzea.ds.character.CharacterLocalDataSource
import com.czxbnb.eorzea.ds.character.CharacterRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DataSourceModule {
    @Provides
    fun provideCharacterLocalDataSource(characterDao: CharacterDao): CharacterLocalDataSource {
        return CharacterLocalDataSource(characterDao)
    }

    @Provides
    fun provideCharacterRemoteDataSource(characterApi: CharacterApi): CharacterRemoteDataSource {
        return CharacterRemoteDataSource(characterApi)
    }
}
