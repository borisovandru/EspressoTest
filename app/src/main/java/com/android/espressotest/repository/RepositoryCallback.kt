package com.android.espressotest.repository

import retrofit2.Response
import com.android.espressotest.model.SearchResponse

interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}