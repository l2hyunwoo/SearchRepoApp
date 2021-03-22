package com.l2hyunwoo.searchrepoapp.data.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("avatar_url") val avatar: String,
    @SerializedName("login") val name: String
)
