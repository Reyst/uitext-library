package com.github.reyst.uitext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.res.stringResource
import com.github.reyst.uitext.UiText.DynamicString
import com.github.reyst.uitext.UiText.StringResource

@Suppress("unused")
@Composable
@ReadOnlyComposable
fun UiText.asString() = when (this) {
    is DynamicString -> value
    is StringResource -> stringResource(resId, *args)
}
