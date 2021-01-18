package com.souza.testing.data.repository

import com.souza.testing.data.api.ApiHelper
import com.souza.testing.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}