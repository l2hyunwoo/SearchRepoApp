package com.l2hyunwoo.searchrepoapp.data.model

import com.google.gson.annotations.SerializedName

data class Repo(
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("stargazers_count") val stars: Int
)
