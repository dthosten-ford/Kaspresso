package com.kaspersky.components.uiautomator_dsl.intercepting.action_and_assertion

import com.kaspersky.components.uiautomator_dsl.intercepting.interaction.UiDeviceInteraction
import com.kaspersky.components.uiautomator_dsl.intercepting.interaction.UiObjectInteraction

typealias UiObjectAction = UiOperation<UiObjectInteraction>

typealias UiObjectAssertion = UiOperation<UiObjectInteraction>

typealias UiDeviceAction = UiOperation<UiDeviceInteraction>

typealias UiDeviceAssertion = UiOperation<UiDeviceInteraction>