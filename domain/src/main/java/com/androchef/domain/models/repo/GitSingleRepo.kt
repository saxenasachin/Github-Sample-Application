package com.androchef.domain.models.repo

/**
Created by Sachin Saxena on 16/06/22.
 */
data class GitSingleRepo(
    val repoName: String = "",
    val repoDescription: String = "",
    val openIssuesCount: Int = -1,
    val forksCount: Int = -1,
    val defaultBranch: String = ""
)