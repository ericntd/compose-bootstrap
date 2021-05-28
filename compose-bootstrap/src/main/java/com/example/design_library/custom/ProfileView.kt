package com.example.design_library.custom

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.design_library.MyTypography.h2
import com.example.design_library.MyTypography.subhead
import com.example.design_library.R

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
                painter = painterResource(id = R.drawable.gear_new_pet_1168772154),
                contentDescription = "wtf",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize().layoutId("image")
            )
            h2(text = "33, Toronto", Modifier.layoutId("title"))
            subhead(text = "Singer/ Composer", Modifier.layoutId("subtitle1"))
            subhead(text = "Abc afew", Modifier.layoutId("subtitle2"))
        }
    }
}