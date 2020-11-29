package com.example.design_library

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import com.airbnb.android.showkase.annotation.ShowkaseTypography

val Roboto = fontFamily(
    font(R.font.roboto_regular),
    font(R.font.roboto_medium, FontWeight.Medium),
    font(R.font.roboto_bold, FontWeight.Bold),
    font(R.font.roboto_thin, FontWeight.Thin),
    font(R.font.roboto_light, FontWeight.Light),
)

val MyTypography = Typography(
    h1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.W300,
        fontSize = 96.sp
    ),
    body1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = MyTheme.colors.onPrimary
    ),
)

object Typography {
    @ShowkaseTypography(name = "Title 3", group = "Text")
    val title3 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )

    @ShowkaseTypography(name = "Body", group = "Text")
    val body = MyTypography.body1

    @ShowkaseTypography(name = "Body", group = "Text")
    val subhead = TextStyle(
        color = MyTheme.colors.onSurface,
        fontSize = 14.sp
    )
}

