package com.example.design_library.texts

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.design_library.Typography

@Composable
fun title3(text: String, modifier: Modifier) {
    Text(text = text, style = Typography.title3, modifier = modifier.padding(16.dp, 8.dp, 16.dp, 8.dp))
}

@Composable
fun body(text: String) {
    Text(text = text, style = Typography.body, modifier = Modifier.padding(16.dp, 8.dp, 16.dp, 8.dp))
}

@Composable
fun subhead(text: String, modifier: Modifier) {
    Text(text = text, style = Typography.subhead, modifier = modifier.padding(16.dp, 8.dp, 16.dp, 8.dp))
}