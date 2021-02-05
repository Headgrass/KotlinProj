package ru.geekbrains.kotlinproj.ui

import ru.geekbrains.kotlinproj.model.NoAuthException
import ru.geekbrains.kotlinproj.model.Repository

class SplashViewModel(private val repository: Repository = Repository) :
    BaseViewModel<Boolean?, SplashViewState>() {
    fun requestUser() {
        repository.getCurrentUser().observeForever { user ->
            viewStateLiveData.value = user?.let {
                SplashViewState(isAuth = true)
            } ?: SplashViewState(error = NoAuthException())
        }

    }
}
