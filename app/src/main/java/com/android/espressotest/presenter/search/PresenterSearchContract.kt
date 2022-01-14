package com.android.espressotest.presenter.search

import com.android.espressotest.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}