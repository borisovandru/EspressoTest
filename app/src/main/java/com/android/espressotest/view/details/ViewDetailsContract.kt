package com.android.espressotest.view.details

import com.android.espressotest.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}