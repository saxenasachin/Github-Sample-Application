package com.androchef.data.models.request

/**
Created by Sachin Saxena on 16/06/22.
 */
data class PullRequestGetBody(
    val userName: String,
    val repositoryName: String,
    val state: String
)