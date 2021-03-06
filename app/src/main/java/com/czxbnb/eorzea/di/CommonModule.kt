package com.czxbnb.eorzea.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class CommonModule {
    @Singleton
    @Provides
    fun provideGson() = Gson()
}
