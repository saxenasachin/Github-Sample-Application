package com.androchef.data.models

/**
Created by Sachin Saxena on 16/06/22.
 */
data class SingleRepoEntity(
    val repoName: String = "",
    val repoDescription: String = "",
    val openIssuesCount: Int = -1,
    val forksCount: Int = -1,
    val defaultBranch: String = ""
)