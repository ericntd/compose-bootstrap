package com.example.design_library.ctas

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import androidx.ui.tooling.preview.PreviewParameter
import com.example.design_library.colorPrimary

const val THE_GROUP = "CTA"
val buttonTextPrimary = TextStyle(color = Color.White, fontWeight = FontWeight.Bold)

@Composable
fun cta(variant: String, text: String) {
    when (ButtonType.valueOf(variant)) {
        ButtonType.PRIMARY -> {
            primaryButton(text)
        }
        ButtonType.DANGEROUS -> {
            dangerousButton(text)
        }
        ButtonType.SECONDARY -> {
            secondaryButton(text)
        }
        ButtonType.POSITIVE -> {
            positiveButton(text)
        }
        ButtonType.HYPER_LINK -> {
            hyperlink(text)
        }
    }
}

@Composable
@Preview(name = "hyperlink", group = THE_GROUP)
fun hyperlink(@PreviewParameter(ButtonTextProvider::class) text: String) {
    val containerModifier = Modifier
    val textStyle = TextStyle(color = colorPrimary, fontWeight = FontWeight.Bold)
    Box(modifier = containerModifier.padding(32.dp, 16.dp, 32.dp, 16.dp)) {
        Text(text, style = textStyle)
    }
}

@Composable
@Preview(name = "secondary", group = THE_GROUP)
fun positiveButton(@PreviewParameter(ButtonTextProvider::class) text: String) {
    val containerModifier = Modifier.clip(RoundedCornerShape(50))
        .background(Color.Green)
        .wrapContentHeight()
    Box(modifier = containerModifier.padding(32.dp, 16.dp, 32.dp, 16.dp)) {
        Text(text, style = buttonTextPrimary)
    }
}

@Composable
@Preview(name = "secondary", group = THE_GROUP)
fun secondaryButton(@PreviewParameter(ButtonTextProvider::class) text: String) {
    val containerModifier = Modifier.border(1.dp, colorPrimary, RoundedCornerShape(50))
    Box(modifier = containerModifier.padding(32.dp, 16.dp, 32.dp, 16.dp)) {
        Text(text)
    }
}

@Composable
@Preview(name = "dangerous", group = THE_GROUP)
fun dangerousButton(@PreviewParameter(ButtonTextProvider::class) text: String) {
    val containerModifier = Modifier.clip(RoundedCornerShape(50))
        .background(Color.Red)
        .wrapContentHeight()
    Box(modifier = containerModifier.padding(32.dp, 16.dp, 32.dp, 16.dp)) {
        Text(text, style = buttonTextPrimary)
    }
}

@Composable
@Preview(name = "primary", group = THE_GROUP)
fun primaryButton(@PreviewParameter(ButtonTextProvider::class) text: String) {
    val containerModifier = Modifier.clip(RoundedCornerShape(50))
        .background(colorPrimary)
        .wrapContentHeight()
    Box(modifier = containerModifier.padding(32.dp, 16.dp, 32.dp, 16.dp)) {
        Text(text, style = buttonTextPrimary)
    }
}
