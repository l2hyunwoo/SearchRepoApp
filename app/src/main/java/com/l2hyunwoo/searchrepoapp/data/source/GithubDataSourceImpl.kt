package com.l2hyunwoo.searchrepoapp.data.source

import com.l2hyunwoo.searchrepoapp.data.api.GithubService
import com.l2hyunwoo.searchrepoapp.data.model.Repo
import com.l2hyunwoo.searchrepoapp.data.model.User
import javax.inject.Inject

class GithubDataSourceImpl @Inject constructor(
    private val service: GithubService
) : GithubDataSource {
    override suspend fun fetchUserInfo(userName: String): User =
        service.userInfo(userName)

    override suspend fun fetchUserRepos(userName: String): List<Repo> =
        service.userRepos(userName)
}