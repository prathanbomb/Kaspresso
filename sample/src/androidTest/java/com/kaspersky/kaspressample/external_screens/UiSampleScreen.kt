package com.kaspersky.kaspressample.external_screens

import com.kaspersky.components.kautomator.dsl.screen.UiScreen

open class UiSampleScreen<out T : UiSampleScreen<T>> : UiScreen<T>() {

    companion object {
        const val PACKAGE = "com.kaspersky.kaspressample"
    }
}