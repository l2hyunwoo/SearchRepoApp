package com.l2hyunwoo.searchrepoapp.di

import com.l2hyunwoo.searchrepoapp.data.repository.GithubRepository
import com.l2hyunwoo.searchrepoapp.data.repository.GithubRepositoryImpl
import com.l2hyunwoo.searchrepoapp.data.source.GithubDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideGithubRepository(dataSource: GithubDataSource): GithubRepository =
        GithubRepositoryImpl(dataSource)
}