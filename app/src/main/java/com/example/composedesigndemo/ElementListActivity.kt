package com.example.composedesigndemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import com.example.design_library.*
import com.example.design_library.ctas.ButtonRepository
import com.example.design_library.ctas.cta

class ElementListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val list = when (intent.getSerializableExtra(ARG_UI_ELEMENT_TYPE)!! as UIElementType) {
            UIElementType.BUTTON -> ButtonRepository.fetchButtons()
            UIElementType.TEXT -> TODO()
            UIElementType.INPUT -> TODO()
            UIElementType.DIALOG -> TODO()
            UIElementType.COLOR -> TODO()
            UIElementType.CUSTOM -> TODO()
        }

        setContent {
            myTheme {
                LazyColumnFor(
                    list,
                    modifier = Modifier.background(color = MyTheme.colors.background)
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) { uiElement ->
                    Box(
                        modifier = Modifier.padding(4.dp) // lie! this is margin
                            .fillMaxWidth()
                            .background(color = MyTheme.colors.surface)
                            .padding(16.dp) // now this is really padding
                    ) {
                        cta(uiElement.variant, uiElement.name)
                        when (uiElement.type) {
                            UIElementType.BUTTON -> cta(uiElement.variant, uiElement.name)
                            UIElementType.TEXT -> TODO()
                            UIElementType.INPUT -> TODO()
                            UIElementType.DIALOG -> TODO()
                            UIElementType.COLOR -> TODO()
                            UIElementType.CUSTOM -> TODO()
                        }
                    }
                }
            }
        }
    }

    companion object {
        private const val ARG_UI_ELEMENT_TYPE = "ARG_UI_ELEMENT_TYPE"

        fun newIntent(context: Context, uiElementType: UIElementType) =
            Intent(context, ElementListActivity::class.java).apply {
                putExtras(Bundle().apply {
                    putSerializable(ARG_UI_ELEMENT_TYPE, uiElementType)
                })
            }
    }
}