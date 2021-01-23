package com.example.callapi2.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GithubProjects (
    val id: String,
    @Json(name = "node_id")
    val nodeId : String,
//    val owner: Owner,
    val name : String,
    val fullName: String
)

data class Owner(
    val login: String,
    val id: String,
//    @Json(name = "avatar_url")
//    val image_url: String
    val avatar_url: String
)