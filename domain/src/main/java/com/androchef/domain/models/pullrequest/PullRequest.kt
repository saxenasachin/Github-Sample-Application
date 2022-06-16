package com.androchef.domain.models.pullrequest

import com.androchef.domain.models.user.User

/**
Created by Sachin Saxena on 16/06/22.
 */
data class PullRequest(
    val id: Int = -1,
    val desc: String = "",
    val title: String = "",
    val user: User = User(),
    val closedAt: String = "",
    val createdAt: String = ""
) {
    enum class State {
        OPEN, CLOSED, ALL
    }
}