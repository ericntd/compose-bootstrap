package com.example.design_library

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.android.showkase.annotation.ShowkaseTypography

val Roboto = fontFamily(
    font(R.font.roboto_regular),
    font(R.font.roboto_medium, FontWeight.Medium),
    font(R.font.roboto_bold, FontWeight.Bold),
    font(R.font.roboto_thin, FontWeight.Thin),
    font(R.font.roboto_light, FontWeight.Light),
)

private val myTypography = Typography(
    h2 = TextStyle(
        fontWeight = FontWeight.Bold,
        color = Color.fromHex("#515160"),
        fontSize = 24.sp
    ),
    body1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp,
        color = MyTheme.colors.onSurface
    ),
    button = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = MyTheme.colors.onPrimary
    ),
)

object MyTypography {
    private val h2 = myTypography.h2


    @ShowkaseTypography(name = "Body", group = "Text")
    val body = myTypography.body1

    @ShowkaseTypography(name = "Body", group = "Text")
    val subhead = TextStyle(
        color = MyTheme.colors.onSurface,
        fontSize = 14.sp
    )

    val button = myTypography.button

    @Composable
    fun h2(text: String, modifier: Modifier = Modifier) {
        Text(text = text, style = h2, modifier = modifier.padding(16.dp, 8.dp, 16.dp, 8.dp))
    }

    @Composable
    fun body(text: String) {
        Text(text = text, style = body, modifier = Modifier.padding(16.dp, 8.dp, 16.dp, 8.dp))
    }

    @Composable
    fun subhead(text: String, modifier: Modifier) {
        Text(text = text, style = subhead, modifier = modifier.padding(16.dp, 8.dp, 16.dp, 8.dp))
    }
}

