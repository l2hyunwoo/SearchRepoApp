package com.l2hyunwoo.searchrepoapp.di

import com.l2hyunwoo.searchrepoapp.data.api.GithubService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    @Singleton
    fun provideWeatherApi(retrofit: Retrofit): GithubService =
        retrofit.create(GithubService::class.java)
}