package com.androchef.githubsampleapp.di.modules

import com.androchef.githubsampleapp.ui.DashboardActivity
import com.doubtnut.core.di.scope.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
Created by Sachin Saxena on 16/06/22.
 */
@Module
abstract class BindingActivityModule {

    @ContributesAndroidInjector(modules = [DashboardActivityModule::class])
    @PerActivity
    abstract fun contributeDashboardActivityInjector(): DashboardActivity
}