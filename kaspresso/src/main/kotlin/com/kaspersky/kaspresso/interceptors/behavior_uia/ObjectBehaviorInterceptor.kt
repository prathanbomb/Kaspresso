package com.kaspersky.kaspresso.interceptors.behavior_uia

import com.kaspersky.components.kautomator.intercepting.interaction.UiObjectInteraction
import com.kaspersky.components.kautomator.intercepting.operation.UiObjectAction
import com.kaspersky.components.kautomator.intercepting.operation.UiObjectAssertion

interface ObjectBehaviorInterceptor :
    KautomatorBehaviorInterceptor<UiObjectInteraction, UiObjectAssertion, UiObjectAction>