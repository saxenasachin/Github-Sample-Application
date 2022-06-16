package com.androchef.githubsampleapp.di.modules

import androidx.lifecycle.ViewModelProvider
import com.androchef.githubsampleapp.di.ViewModelFactory
import dagger.Binds
import dagger.Module

/**
Created by Sachin Saxena on 16/06/22.
 */
@Module
abstract class ViewModelProviderModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}
