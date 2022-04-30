package com.czxbnb.eorzea.di

import com.czxbnb.eorzea.ds.character.CharacterLocalDataSource
import com.czxbnb.eorzea.ds.character.CharacterRemoteDataSource
import com.czxbnb.eorzea.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {
    @Provides
    fun provideCharacterRepository(
        characterLocalDataSource: CharacterLocalDataSource,
        characterRemoteDataSource: CharacterRemoteDataSource
    ): CharacterRepository {
        return CharacterRepository(characterLocalDataSource, characterRemoteDataSource)
    }
}
