package com.androchef.data.repositories

import com.androchef.data.models.PullRequestEntity
import com.androchef.data.models.SingleRepoEntity
import com.androchef.data.models.request.PullRequestGetBody
import io.reactivex.Single

/**
Created by Sachin Saxena on 16/06/22.
 */
interface GitRemote {
    fun getUserGitRepositories(username: String): Single<List<SingleRepoEntity>>

    fun getPullRequestList(pullRequestGetBody: PullRequestGetBody): Single<List<PullRequestEntity>>
}