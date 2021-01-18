package com.souza.testing.data.api

import com.souza.testing.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}