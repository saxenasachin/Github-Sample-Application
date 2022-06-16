package com.androchef.githubsampleapp.di.modules

import androidx.lifecycle.ViewModel
import com.androchef.githubsampleapp.di.scope.ViewModelKey
import com.androchef.presentation.viewmodel.GitDataViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
Created by Sachin Saxena on 16/06/22.
 */
@Module
abstract class DashboardActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(GitDataViewModel::class)
    abstract fun bindsMainViewModel(gitDataViewModel: GitDataViewModel): ViewModel
}