package com.example.composedesigndemo

import com.example.design_library.ButtonType
import com.example.design_library.UIElementType

object ButtonRepository {
    fun fetchButtons(): List<UIElement> {
        return listOf(
            UIElement(
                "Primary button",
                "Should be used for main action except for positive and dangerous cases",
                UIElementType.BUTTON,
                ButtonType.PRIMARY.toString()
            )
        )
    }
}