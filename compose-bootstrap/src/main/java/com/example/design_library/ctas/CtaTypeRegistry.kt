package com.example.design_library.ctas

import com.example.design_library.UIElement
import com.example.design_library.UIElementType

object CtaTypeRegistry {
    val buttonTypes: List<UIElement>
        get() = listOf(
            UIElement(
                "A Primary Action",
                "Should be used for main action except for positive and dangerous cases",
                UIElementType.BUTTON,
                Buttons.Type.PRIMARY.toString()
            ),
            UIElement(
                "A Secondary Action",
                "Secondary actions like Cancel",
                UIElementType.BUTTON,
                Buttons.Type.SECONDARY.toString()
            ),
            UIElement(
                "A Positive Action",
                "Buy stuffs?",
                UIElementType.BUTTON,
                Buttons.Type.POSITIVE.toString()
            ),
            UIElement(
                "A Dangerous Action",
                "Delete profile?",
                UIElementType.BUTTON,
                Buttons.Type.DANGEROUS.toString()
            ),
            UIElement(
                "A Hyperlink",
                "Terms & conditions?",
                UIElementType.BUTTON,
                Buttons.Type.HYPER_LINK.toString()
            ),
        )
}