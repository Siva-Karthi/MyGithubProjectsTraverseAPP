package com.example.callapi2.overview

import androidx.lifecycle.*
import com.example.callapi2.network.GithubApi
import com.example.callapi2.network.GithubProjects
import kotlinx.coroutines.Dispatchers

class OverviewViewModel : ViewModel(){
//    private val __repos = MutableLiveData<List<GithubProjects>>().apply { listOf<GithubProjects>(GithubProjects(id = "id", nodeId = "nodeis", name = "siva", fullName = "siva s")) }
//    private val repos LiveData<GithubProjects> = MutableLiveData()
        // add Dispacthers.IODispacthers.IO
    val repos: LiveData<List<GithubProjects>> = liveData() {
    val data = GithubApi.retrofitservice.getRepos()
    emit(data)
}
    private val userId: LiveData<String> = MutableLiveData()
//    val repos : LiveData<List<GithubProjects>>
//        get() = __repos

    init {
//        populateReposInit()
    }

//    private fun populateReposInit(){
//        // add processing , failiure and all later
//        __repos = liveData {
//            emit(GithubApi.retrofitservice.getRepos())
//        }
//    }
}