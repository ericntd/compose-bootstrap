package com.example.composedesigndemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.design_library.UIElement
import com.example.design_library.UIElementType
import com.example.design_library.ctas.Buttons

class SingleComponentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val uiElement = intent.getParcelableExtra<UIElement>(ARG_UI_ELEMENT)!!
        setContent {
            Box(modifier = Modifier.padding(16.dp)) {
                when (uiElement.type) {
                    UIElementType.BUTTON -> Buttons.cta(uiElement.variant, uiElement.name)
                    UIElementType.TEXT -> TODO()
                }
            }
        }
    }

    companion object {
        private const val ARG_UI_ELEMENT = "ARG_UI_ELEMENT"
        fun newIntent(context: Context, uiElement: UIElement) =
            Intent(context, SingleComponentActivity::class.java).apply {
                putExtras(Bundle().apply {
                    putParcelable(ARG_UI_ELEMENT, uiElement)
                })
            }
    }
}