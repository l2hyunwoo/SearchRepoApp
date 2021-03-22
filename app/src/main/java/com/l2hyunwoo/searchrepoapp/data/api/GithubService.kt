package com.l2hyunwoo.searchrepoapp.data.api

import com.l2hyunwoo.searchrepoapp.data.model.Repo
import com.l2hyunwoo.searchrepoapp.data.model.User
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("users/{username}")
    suspend fun userInfo(
        @Path("username") username: String
    ): User

    @GET("users/{username}/repos")
    suspend fun userRepos(
        @Path("username") username: String
    ): List<Repo>
}