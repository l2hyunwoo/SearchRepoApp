package com.l2hyunwoo.searchrepoapp.data.source

import com.l2hyunwoo.searchrepoapp.data.model.Repo
import com.l2hyunwoo.searchrepoapp.data.model.User

interface GithubDataSource {
    suspend fun fetchUserInfo(userName: String): User
    suspend fun fetchUserRepos(userName: String): List<Repo>
}