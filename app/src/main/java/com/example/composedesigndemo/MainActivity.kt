package com.example.composedesigndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.design_library.UIElementType
import com.example.design_library.createShowkaseBrowserIntent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val list = listOf(
            generateSimpleItem("Call-To-Actions", "Buttons and Hyper-links", UIElementType.BUTTON),
            generateSimpleItem("Text", "Title, Heading 1, ..., paragraph", UIElementType.TEXT),
            generateSimpleItem("Inputs", "Text input, checkboxes, radio buttons...", UIElementType.INPUT),
            generateSimpleItem("Dialogs", "Pop-up, Bottom-Sheets", UIElementType.DIALOG),
            generateSimpleItem("Colours", "Colours", UIElementType.COLOR),
            generateSimpleItem("Custom", "Profile cards, chat item", UIElementType.CUSTOM),
        )
        setContent {
            Column {
                Button(onClick = { startActivity(createShowkaseBrowserIntent(this@MainActivity)) }) {
                    Text("Showkase")
                }
                Divider()
                LazyColumnFor(list) {
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

    private fun generateSimpleItem(name: String, description: String, type: UIElementType): UIElementCategoryItem {
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