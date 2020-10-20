package com.example.design_library.ctas

import com.example.design_library.UIElement
import com.example.design_library.UIElementType

object ButtonRepository {
    fun fetchButtons(): List<UIElement> {
        return listOf(
            UIElement(
                "A Primary Action",
                "Should be used for main action except for positive and dangerous cases",
                UIElementType.BUTTON,
                ButtonType.PRIMARY.toString()
            ),
            UIElement(
                "A Secondary Action",
                "Secondary actions like Cancel",
                UIElementType.BUTTON,
                ButtonType.SECONDARY.toString()
            ),
            UIElement(
                "A Positive Action",
                "Buy stuffs?",
                UIElementType.BUTTON,
                ButtonType.POSITIVE.toString()
            ),
            UIElement(
                "A Dangerous Action",
                "Delete profile?",
                UIElementType.BUTTON,
                ButtonType.DANGEROUS.toString()
            ),
            UIElement(
                "A Hyperlink",
                "Terms & conditions?",
                UIElementType.BUTTON,
                ButtonType.HYPER_LINK.toString()
            ),
        )
    }
}