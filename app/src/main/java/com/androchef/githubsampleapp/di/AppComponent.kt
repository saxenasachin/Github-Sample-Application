package com.androchef.githubsampleapp.di

import android.app.Application
import com.androchef.githubsampleapp.GithubApplication
import com.androchef.githubsampleapp.di.modules.*
import com.androchef.githubsampleapp.ui.DashboardActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
Created by Sachin Saxena on 16/06/22.
 */
@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        BindingActivityModule::class,
        DashboardActivityModule::class,
        ViewModelProviderModule::class,
        DomainModule::class,
        RemoteModule::class,
        UIModule::class,
        AndroidSupportInjectionModule::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(githubApplication: GithubApplication)
}