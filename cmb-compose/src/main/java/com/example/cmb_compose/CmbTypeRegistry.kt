package com.example.cmb_compose

import com.example.design_library.UIElement
import com.example.design_library.UIElementType

object CmbTypeRegistry {
    val cmbTypes: List<UIElement>
        get() = listOf(
            UIElement("empty_state", "", UIElementType.CUSTOM, "only")
        )
}