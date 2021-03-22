package com.l2hyunwoo.searchrepoapp.di

import com.l2hyunwoo.searchrepoapp.data.api.GithubService
import com.l2hyunwoo.searchrepoapp.data.source.GithubDataSource
import com.l2hyunwoo.searchrepoapp.data.source.GithubDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun provideGithubDataSource(githubService: GithubService): GithubDataSource =
        GithubDataSourceImpl(githubService)
}