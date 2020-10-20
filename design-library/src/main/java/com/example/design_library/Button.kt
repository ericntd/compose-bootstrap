package com.example.design_library

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun primaryButton(variant: String) {
    val modifier = when (ButtonType.valueOf(variant)) {
        ButtonType.PRIMARY -> {
            val shape = RoundedCornerShape(16.dp)
            val color = Color.fromHex("#5b6fd0")
            Modifier.clip(shape)
                .background(color)
                .wrapContentHeight()
                .padding(32.dp, 16.dp, 32.dp, 16.dp)
        }
        ButtonType.SECONDARY -> TODO()
        ButtonType.DANGEROUS -> TODO()
        ButtonType.POSITIVE -> TODO()
        ButtonType.HYPER_LINK -> TODO()
    }
    Box(modifier = modifier) {
        Text("The button", fontSize = 16.sp, color = Color.White, fontWeight = FontWeight.Bold)
    }
}
