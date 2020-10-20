package com.example.design_library

import androidx.compose.ui.graphics.Color

fun Color.Companion.fromHex(hexString: String) : Color {
    return Color(android.graphics.Color.parseColor(hexString))
}