package com.androchef.data.repositories

import com.androchef.data.models.PullRequestEntity
import com.androchef.data.models.SingleRepoEntity
import io.reactivex.Single

/**
Created by Sachin Saxena on 16/06/22.
 */
interface GitDataStore {
    fun getUserGitRepositories(username: String): Single<List<SingleRepoEntity>>

    fun getPullRequestList(
        username: String,
        repoName: String,
        state: String
    ): Single<List<PullRequestEntity>>
}