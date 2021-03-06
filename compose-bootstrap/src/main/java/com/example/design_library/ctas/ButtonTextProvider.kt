package com.example.design_library.ctas

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class ButtonTextProvider : PreviewParameterProvider<String> {
    override val values: Sequence<String>
        get() = sequenceOf("KISS", "Super Long CTA Text")

}