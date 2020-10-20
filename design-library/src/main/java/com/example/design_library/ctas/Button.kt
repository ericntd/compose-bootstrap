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
import com.example.design_library.fromHex

@Composable
fun primaryButton(variant: String, text: String) {
    val cmbPurple = Color.fromHex("#5b6fd0")
    val containerModifier : Modifier
    val textStyle : TextStyle
    when (ButtonType.valueOf(variant)) {
        ButtonType.PRIMARY -> {
            containerModifier = Modifier.clip(RoundedCornerShape(50))
                .background(cmbPurple)
                .wrapContentHeight()
            textStyle = TextStyle(color = Color.White, fontWeight = FontWeight.Bold)
        }
        ButtonType.DANGEROUS -> {
            containerModifier = Modifier.clip(RoundedCornerShape(50))
                .background(Color.Red)
                .wrapContentHeight()
            textStyle = TextStyle(color = Color.White, fontWeight = FontWeight.Bold)
        }
        ButtonType.SECONDARY -> {
            containerModifier = Modifier.border(1.dp, cmbPurple, RoundedCornerShape(50))
            textStyle = TextStyle()
        }
        ButtonType.POSITIVE -> {
            containerModifier = Modifier.clip(RoundedCornerShape(50))
                .background(Color.Green)
                .wrapContentHeight()
            textStyle = TextStyle(color = Color.White, fontWeight = FontWeight.Bold)
        }
        ButtonType.HYPER_LINK -> {
            containerModifier = Modifier
            textStyle = TextStyle(color = cmbPurple, fontWeight = FontWeight.Bold)
        }
    }
    Box(modifier = containerModifier.padding(32.dp, 16.dp, 32.dp, 16.dp)) {
        Text(text, style = textStyle)
    }
}
