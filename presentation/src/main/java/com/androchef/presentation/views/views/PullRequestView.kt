package com.androchef.presentation.views.views

/**
Created by Sachin Saxena on 16/06/22.
 */
data class PullRequestView(
    val id: Int = -1,
    val prTitle: String = "",
    val prDesc: String = "",
    val user: UserView = UserView(),
    val closedAt: String = "",
    val createdAt: String = ""
)