package com.example.design_library

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import kotlin.random.Random

val myPurple = Color.fromHex("#5b6fd0")
/**
 * Android theme colours
 */
val Yellow200 = Color(0xffffeb46)
val Blue200 = Color(0xff91a4fc)
// ...

// https://material.io/design/color/dark-theme.html#anatomy
val DarkColors = darkColors(
    background = Color.DarkGray,
    surface = Color.Black,
    primary = Color.fromHex("#cc99ff"),
    secondary = Blue200,
    onBackground = Color.LightGray,
    onSurface = Color.White, // prolly too strong
    onPrimary = Color.Black,
    onSecondary = Color.Black
)

// https://material.io/design/color/dark-theme.html#anatomy
val LightColors = lightColors(
    primary = myPurple,
    primaryVariant = Yellow200,
    secondary = Blue200,
    surface = Color.White,
    background = Color.LightGray,
    onBackground = Color.DarkGray,
    onSurface = Color.DarkGray,
    onPrimary = Color.White,
    onSecondary = Color.White
)

object MyTheme {
    var colors = if (Random.nextBoolean()) DarkColors else LightColors
}

@Composable
fun myTheme(content: @Composable () -> Unit) {
    MyTheme.colors = if (isSystemInDarkTheme()) DarkColors else LightColors
    content.invoke()
}

/**
 * Contextual colours
 */
val colorPrimary = MyTheme.colors.primary

val buttonColor = MyTheme.colors.primary

val textSurface = MyTheme.colors.onSurface

val cardBackgroundColor = MyTheme.colors.surface
