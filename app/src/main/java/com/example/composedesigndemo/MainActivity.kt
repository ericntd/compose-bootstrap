package com.example.composedesigndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.design_library.UIElementType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val list = listOf(
            generateSimpleItem("Buttons", UIElementType.BUTTON)
        )
        setContent {
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

    private fun generateSimpleItem(name: String, type: UIElementType): UIElementCategoryItem {
        return UIElementCategoryItem(name, type) {
            startActivity(
                ElementListActivity.newIntent(this, type)
            )
        }
    }

    data class UIElementCategoryItem(
        val name: String,
        val uiElementType: UIElementType,
        val clickListener: () -> Unit
    )
}