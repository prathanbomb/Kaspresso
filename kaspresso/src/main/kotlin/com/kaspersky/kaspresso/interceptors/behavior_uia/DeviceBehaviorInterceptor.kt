package com.kaspersky.kaspresso.interceptors.behavior_uia

import com.kaspersky.components.kautomator.intercepting.interaction.UiDeviceInteraction
import com.kaspersky.components.kautomator.intercepting.operation.UiDeviceAction
import com.kaspersky.components.kautomator.intercepting.operation.UiDeviceAssertion

interface DeviceBehaviorInterceptor :
    KautomatorBehaviorInterceptor<UiDeviceInteraction, UiDeviceAssertion, UiDeviceAction>