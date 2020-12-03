package com.example.cmb_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.design_library.MyTypography
import com.example.design_library.R
import com.example.design_library.ctas.Buttons
import com.example.design_library.ctas.Buttons.cta

@Composable
fun emptyState() {
    Box(Modifier.height(500.dp)) {
        Column(Modifier.align(Alignment.Center)) {
            Image(asset = imageResource(id = R.drawable.gear_new_pet_1168772154))
            MyTypography.h2(
                "This is the title"
            )
            MyTypography.body("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum")
            cta(Buttons.Type.PRIMARY.toString(), "Take action now!")
        }
    }
}
