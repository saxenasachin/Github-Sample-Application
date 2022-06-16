package com.androchef.presentation.viewmodel

import com.androchef.presentation.views.views.PullRequestView
import com.androchef.presentation.views.views.SingleRepoView

sealed class GitDataState {

    object Init : GitDataState()

    data class Loading(val message: String) : GitDataState()

    data class Error(val message: String) : GitDataState()

    data class GetUsersRepositoriesSuccess(
        val lisOfRepos: List<SingleRepoView>
    ) : GitDataState()

    data class GetPullRequestsSuccess(
        val lisOfPullRequests: List<PullRequestView>
    ) : GitDataState()
}