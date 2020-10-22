package com.example.design_library

import androidx.compose.foundation.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.airbnb.android.showkase.annotation.ShowkaseTypography

object Typography {
    @ShowkaseTypography(name = "Title 3", group = "Text")
    val title3 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )

    @ShowkaseTypography(name = "Body", group = "Text")
    val body = TextStyle(
        fontSize = 14.sp
    )

    @ShowkaseTypography(name = "Body", group = "Text")
    val subhead = TextStyle(
        color = titleTextColor,
        fontSize = 14.sp
    )
}

