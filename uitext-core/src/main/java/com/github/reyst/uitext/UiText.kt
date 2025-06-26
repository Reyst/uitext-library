package com.github.reyst.uitext

import android.content.Context
import androidx.annotation.StringRes

@Suppress("SpreadOperator", "unused", "MemberVisibilityCanBePrivate")
sealed class UiText {
    data class DynamicString(val value: String) : UiText()

    class StringResource(
        @param:StringRes
        val resId: Int,

        vararg val args: Any,
    ) : UiText()

    fun asString(context: Context) = when (this) {
        is DynamicString -> value
        is StringResource -> context.getString(resId, *args)
    }

    fun isEmpty(): Boolean {
        return when (this) {
            is DynamicString -> value.isBlank()
            is StringResource -> resId == 0
        }
    }

    companion object {
        fun empty() = create("")

        fun create(string: String): UiText = DynamicString(string)

        fun create(
            @StringRes resId: Int,
            vararg args: Any,
        ): UiText = StringResource(resId, *args)
    }
}
