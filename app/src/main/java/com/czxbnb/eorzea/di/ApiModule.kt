package com.czxbnb.eorzea.di

import com.czxbnb.eorzea.api.CharacterApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApiModule {
    @Singleton
    @Provides
    fun provideCharacterApi(): CharacterApi {
        return CharacterApi.create()
    }
}
