package com.android.espressotest.repository

import retrofit2.Response
import com.android.espressotest.model.SearchResponse
import com.android.espressotest.presenter.RepositoryContract

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}