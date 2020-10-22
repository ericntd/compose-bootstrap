package com.example.design_library.custom

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.design_library.R
import com.example.design_library.texts.subhead
import com.example.design_library.texts.title3

const val GROUP_CUSTOM = "CUSTOM"

@Composable
@Preview(name = "Profile View", group = GROUP_CUSTOM)
fun profileView() {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 32.dp)) {
            Image(
                asset = imageResource(id = R.drawable.gear_new_pet_1168772154),
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize().layoutId("image")
            )
            title3(text = "33, Toronto", Modifier.layoutId("title"))
            subhead(text = "Singer/ Composer", Modifier.layoutId("subtitle1"))
            subhead(text = "Abc afew", Modifier.layoutId("subtitle2"))
        }
    }
}