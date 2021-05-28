package com.example.design_library.ctas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.design_library.MyTheme
import com.example.design_library.MyTypography
import com.example.design_library.colorPrimary

const val GROUP_CTA = "CTA"

object Buttons {
    enum class Type {
        PRIMARY,
        SECONDARY,
        DANGEROUS,
        POSITIVE,
        HYPER_LINK
    }

    @Composable
    fun cta(variant: String, text: String) {
        when (Type.valueOf(variant)) {
            Type.PRIMARY -> {
                primaryButton(text)
            }
            Type.DANGEROUS -> {
                dangerousButton(text)
            }
            Type.SECONDARY -> {
                secondaryButton(text)
            }
            Type.POSITIVE -> {
                positiveButton(text)
            }
            Type.HYPER_LINK -> {
                hyperlink(text)
            }
        }
    }

    @Composable
    @Preview(name = "hyperlink", group = GROUP_CTA)
    fun hyperlink(@PreviewParameter(ButtonTextProvider::class) text: String) {
        val containerModifier = Modifier
        val textStyle = MyTypography.button.copy(color = MyTheme.colors.primary)
        TextStyle(color = colorPrimary, fontWeight = FontWeight.Bold)
        Box(modifier = containerModifier.padding(24.dp, 16.dp, 24.dp, 16.dp)) {
            Text(text, style = textStyle)
        }
    }

    @Composable
    @Preview(name = "secondary", group = GROUP_CTA)
    fun positiveButton(@PreviewParameter(ButtonTextProvider::class) text: String) {
        val containerModifier = Modifier.clip(RoundedCornerShape(50))
            .background(Color.Green)
            .wrapContentHeight()
        Box(modifier = containerModifier.padding(24.dp, 16.dp, 24.dp, 16.dp)) {
            Text(text, style = MyTypography.button)
        }
    }

    @Composable
    @Preview(name = "secondary", group = GROUP_CTA)
    fun secondaryButton(@PreviewParameter(ButtonTextProvider::class) text: String) {
        val containerModifier = Modifier.border(1.dp, colorPrimary, RoundedCornerShape(50))
        Box(modifier = containerModifier.padding(24.dp, 16.dp, 24.dp, 16.dp)) {
            Text(text, style = MyTypography.button.copy(color = MyTheme.colors.primary))
        }
    }

    @Composable
    @Preview(name = "dangerous", group = GROUP_CTA)
    fun dangerousButton(@PreviewParameter(ButtonTextProvider::class) text: String) {
        val containerModifier = Modifier.clip(RoundedCornerShape(50))
            .background(Color.Red)
            .wrapContentHeight()
        Box(modifier = containerModifier.padding(24.dp, 16.dp, 24.dp, 16.dp)) {
            Text(text, style = MyTypography.button)
        }
    }

    @Composable
    @Preview(name = "primary", group = GROUP_CTA)
    fun primaryButton(@PreviewParameter(ButtonTextProvider::class) text: String) {
        val containerModifier = Modifier.clip(RoundedCornerShape(50))
            .background(colorPrimary)
            .wrapContentHeight()
        Box(modifier = containerModifier.padding(24.dp, 16.dp, 24.dp, 16.dp)) {
            Text(text, style = MyTypography.button)
        }
    }
}
