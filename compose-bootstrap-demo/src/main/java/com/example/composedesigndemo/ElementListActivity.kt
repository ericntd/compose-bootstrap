package com.example.composedesigndemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cmb_compose.CmbTypeRegistry
import com.example.cmb_compose.emptyState
import com.example.design_library.*
import com.example.design_library.ctas.Buttons.cta
import com.example.design_library.ctas.CtaTypeRegistry
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ElementListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val uiElementType = intent.getSerializableExtra(ARG_UI_ELEMENT_TYPE)!! as UIElementType
        this.title = uiElementType.toString()
        val list = when (uiElementType) {
            UIElementType.BUTTON -> CtaTypeRegistry.buttonTypes
            UIElementType.TEXT -> emptyList()
            UIElementType.INPUT -> emptyList()
            UIElementType.DIALOG -> emptyList()
            UIElementType.COLOR -> emptyList()
            UIElementType.CUSTOM -> CmbTypeRegistry.cmbTypes
        }

        setContent {
            myTheme {
                LazyColumn(
                    modifier = Modifier.background(color = MyTheme.colors.background)
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    this.items(list) { uiElement ->
                        Box(
                            modifier = Modifier.padding(4.dp) // lie! this is margin
                                .fillMaxWidth()
                                .background(color = MyTheme.colors.surface)
                                .padding(16.dp) // now this is really padding
                        ) {
                            when (uiElement.type) {
                                UIElementType.BUTTON -> cta(uiElement.variant, uiElement.name)
                                UIElementType.TEXT -> TODO()
                                UIElementType.INPUT -> TODO()
                                UIElementType.DIALOG -> TODO()
                                UIElementType.COLOR -> TODO()
                                UIElementType.CUSTOM -> renderCustom(uiElement)
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun renderCustom(uiElement: UIElement) {
        when (uiElement.name) {
            "empty_state" -> emptyState()
            else -> Unit
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