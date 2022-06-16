package com.androchef.githubsampleapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import com.androchef.githubsampleapp.GithubApplication
import com.androchef.githubsampleapp.R
import com.androchef.githubsampleapp.databinding.ActivityDashboardBinding
import com.androchef.githubsampleapp.di.ViewModelFactory
import com.androchef.githubsampleapp.extensions.*
import com.androchef.githubsampleapp.ui.base.BaseBindingActivity
import com.androchef.githubsampleapp.ui.landing.LandingFragment
import com.androchef.presentation.base.BaseViewModel
import com.androchef.presentation.viewmodel.GitDataState
import com.androchef.presentation.viewmodel.GitDataViewModel
import javax.inject.Inject

/**
Created by Sachin Saxena on 16/06/22.
 */
class DashboardActivity :
    BaseBindingActivity<BaseViewModel<GitDataState>, ActivityDashboardBinding>() {

    companion object {
        private const val TAG = "DashboardActivity"
        fun getStartIntent(context: Context): Intent =
            Intent(context, DashboardActivity::class.java)
    }

    @Inject
    lateinit var viewModeFactory: ViewModelFactory

    override fun setupObservers() {
        super.setupObservers()
        viewModel.stateObservable.observe(this, Observer {
            updateState(it)
        })
    }

    private fun updateState(state: GitDataState) {
        when (state) {
            is GitDataState.Loading -> showLoading(state.message)
            else -> hideLoading()
        }
    }

    private fun showLoading(message: String) {
        binding.apply {
            tvLoadingMessage.text = message
            tvLoadingMessage.visible()
            loadingProgressbar.visible()
            mainFragmentContainer.gone()
        }
    }

    private fun hideLoading() {
        binding.apply {
            tvLoadingMessage.gone()
            loadingProgressbar.gone()
            mainFragmentContainer.visible()
        }
    }

    private fun loadLandingFragment() {
        addFragment(R.id.mainFragmentContainer, LandingFragment.newInstance())
    }

    override fun provideViewBinding(): ActivityDashboardBinding =
        ActivityDashboardBinding.inflate(layoutInflater)

    override fun providePageName(): String = TAG

    override fun provideViewModel(): BaseViewModel<GitDataState> =
        viewModelProvider<GitDataViewModel>(viewModeFactory)

    override fun setupView(savedInstanceState: Bundle?) {
        loadLandingFragment()
    }
}