package com.example.callapi2.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

/*
8 steps

1. add dependencies
2. base url
3. create moshi object using moshi builder
4. create retrofit object using retrofit builder and add moshi adapter
5. create api service (interface) and just define the apis
6. create public object and connect retrofit object
7. call, enqueue, on failiure and all how to handle in coroutine and suspend function, pass flow, how to set status??
8.add permission
 */

//2. base url
private val BASE_URL = "https://api.github.com/"

//3. moshi object
private val moshi = Moshi.Builder().build()
//val grAdapter = moshi.adapter(GithubProjects::class.java)
//val json = grAdapter.toJson(GithubProjects(id = "id", node_id = "nodeis", name = "siva", fullName = "siva s"))

//4.create retroft object
private val retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(
    BASE_URL).build()

//5. create api service
interface GithubApiService {
    // ToDo : convert to coroutines and flow
    @GET("/users/Siva-Karthi/repos")
    suspend fun getRepos() : List<GithubProjects>
}

object GithubApi{
    val retrofitservice: GithubApiService by lazy { retrofit.create(GithubApiService::class.java) }
}