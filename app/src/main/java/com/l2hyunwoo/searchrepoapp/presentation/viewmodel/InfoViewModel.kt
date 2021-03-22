package com.l2hyunwoo.searchrepoapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.l2hyunwoo.searchrepoapp.data.model.Repo
import com.l2hyunwoo.searchrepoapp.data.model.User
import com.l2hyunwoo.searchrepoapp.data.repository.GithubRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InfoViewModel @Inject constructor(
    private val repository: GithubRepository
) : ViewModel() {
    private val _user = MutableLiveData<User>()
    val user: LiveData<User>
        get() = _user
    private val _repoList = MutableLiveData<List<Repo>>()
    val repoList: LiveData<List<Repo>>
        get() = _repoList

    private fun getUserInfo(userName: String) {
        viewModelScope.launch {
            runCatching { repository.userInfo(userName) }
                .onSuccess { _user.value = it }
                .onFailure { it.printStackTrace() }
        }
    }

    private fun getUserRepos(userName: String) {
        viewModelScope.launch {
            runCatching { repository.userRepos(userName) }
                .onSuccess { _repoList.value = it }
                .onFailure { it.printStackTrace() }
        }
    }

    fun intiUserData(userName: String) {
        with(userName) {
            getUserInfo(this)
            getUserRepos(this)
        }
    }
}