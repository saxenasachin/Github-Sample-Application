package com.androchef.githubsampleapp

import android.app.Application
import com.androchef.githubsampleapp.di.AppComponent
import com.androchef.githubsampleapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

/**
Created by Sachin Saxena on 16/06/22.
 */
class GithubApplication : Application(), HasAndroidInjector {

    init {
        instance = this
    }

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }

    var appComponent: AppComponent =
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .also {
                it.inject(this)
            }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        var instance: GithubApplication? = null
        fun appComponent(): AppComponent {
            return instance!!.appComponent
        }
    }
}
