package com.androchef.data.store

import com.androchef.data.repositories.GitDataStore
import javax.inject.Inject

/**
Created by Sachin Saxena on 16/06/22.
 */
class GitDataStoreFactory @Inject constructor(
    private val gitRemoteDataStore: GitRemoteDataStore
) {

    fun getRemoteDataStore(): GitDataStore {
        return gitRemoteDataStore
    }
}