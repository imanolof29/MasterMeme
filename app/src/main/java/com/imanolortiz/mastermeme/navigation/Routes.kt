package com.imanolortiz.mastermeme.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable


@Serializable
data object YourMemeScreen

@Serializable
@Parcelize
data class NewMemeScreen(
    val meme: Int
): Parcelable

