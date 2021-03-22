package com.l2hyunwoo.searchrepoapp.data.repository

import com.l2hyunwoo.searchrepoapp.data.model.Repo
import com.l2hyunwoo.searchrepoapp.data.model.User

interface GithubRepository {
    suspend fun userInfo(userName: String): User
    suspend fun userRepos(userName: String): List<Repo>
}