package com.example.composedesigndemo

import android.os.Parcelable
import android.view.View
import com.example.design_library.UIElementType
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class UIElement(
    val name: String,
    val description: String,
    val type: UIElementType,
    val variant: String
) : Parcelable