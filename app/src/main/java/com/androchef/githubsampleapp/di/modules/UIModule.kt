package com.androchef.githubsampleapp.di.modules

import com.androchef.domain.executor.PostExecutionThread
import com.androchef.githubsampleapp.UiThread
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
Created by Sachin Saxena on 16/06/22.
 */
@Module
class UIModule {

    @Provides
    @Singleton
    fun providePostExecutionThread(uiThread: UiThread): PostExecutionThread {
        return uiThread
    }
}
