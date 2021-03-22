package com.l2hyunwoo.searchrepoapp.data.repository

import com.l2hyunwoo.searchrepoapp.data.model.Repo
import com.l2hyunwoo.searchrepoapp.data.model.User
import com.l2hyunwoo.searchrepoapp.data.source.GithubDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val dataSource: GithubDataSource
) : GithubRepository {
    override suspend fun userInfo(userName: String): User = dataSource.fetchUserInfo(userName)

    override suspend fun userRepos(userName: String): List<Repo> =
        withContext(Dispatchers.IO) {
            dataSource.fetchUserRepos(userName)
                .sortedByDescending { it.stars }
        }

}