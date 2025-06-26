package com.github.reyst.uitext.demo

import androidx.lifecycle.ViewModel
import com.github.reyst.uitext.UiText

class DemoViewModel : ViewModel() {
    val name = UiText.Companion.create("Android")

    val appName = UiText.create(R.string.app_name)
}
