package com.androchef.domain.executor

import io.reactivex.Scheduler

/**
Created by Sachin Saxena on 16/06/22.
 */
interface PostExecutionThread {
    val scheduler: Scheduler
}
