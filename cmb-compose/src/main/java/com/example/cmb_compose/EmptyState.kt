package com.example.cmb_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.design_library.MyTypography
import com.example.design_library.R
import com.example.design_library.ctas.Buttons
import com.example.design_library.ctas.Buttons.cta

/**
 * Nesting the items under Boxes shouldn't be necessary
 * There are bugs and limitations at the moment
 * - Composable function with @Preview cannot 2nd argument now
 * - Without @Preview, component failed to render silently
 */
@Composable
fun emptyState() {
    ConstraintLayout(Modifier.height(1000.dp)) {
        val (image, title, desc, button) = createRefs()
        createVerticalChain(image, title, desc, button, chainStyle = ChainStyle.Packed)

        Box(Modifier.constrainAs(image) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }) {
            Image(painter = painterResource(id = R.drawable.gear_new_pet_1168772154), contentDescription = "feafe")
        }
        Box(Modifier.constrainAs(title) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(image.bottom)
        }) {
            MyTypography.h2("This is the title")
        }
        Box(Modifier.constrainAs(desc) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(title.bottom)
        }) {
            MyTypography.body("Lorem Ipsum is simply dummy text of the printing and typesetting industry")
        }
        Box(Modifier.constrainAs(button) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(desc.bottom)
            bottom.linkTo(parent.bottom)
        }) {
            cta(Buttons.Type.PRIMARY.toString(), "Take action now!")
        }
    }
}
