package com.example.composedesigndemo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.design_library.UIElementType
import androidx.compose.foundation.lazy.items

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val list = listOf(
            generateSimpleItem("Colours", "Colours", UIElementType.COLOR),
            generateSimpleItem("Text", "Title, Heading 1, ..., paragraph", UIElementType.TEXT),
            generateSimpleItem("Call-To-Actions", "Buttons and Hyper-links", UIElementType.BUTTON),
            generateSimpleItem("Inputs", "Text input, checkboxes, radio buttons...", UIElementType.INPUT),
            generateSimpleItem("Dialogs", "Pop-up, Bottom-Sheets", UIElementType.DIALOG),
            generateSimpleItem("Custom", "Profile cards, chat item", UIElementType.CUSTOM),
        )
        setContent {
            Column {
                LazyColumn {
                    items(list) {
                        val modifier = Modifier.padding(all = 16.dp)
                            .clickable(onClick = {
                                it.clickListener.invoke()
                            })
                        Column(modifier = modifier) {
                            Text(text = it.name)
                        }
                    }
                }
            }
        }
    }

    private fun generateSimpleItem(
        name: String,
        description: String,
        type: UIElementType
    ): UIElementCategoryItem {
        return UIElementCategoryItem(name, description, type) {
            startActivity(
                ElementListActivity.newIntent(this, type)
            )
        }
    }

    data class UIElementCategoryItem(
        val name: String,
        val description: String,
        val uiElementType: UIElementType,
        val clickListener: () -> Unit
    )
}