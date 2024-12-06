package com.imanolortiz.mastermeme.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.imanolortiz.mastermeme.R

var ManropeFontFamily = FontFamily(
    Font(R.font.manrope_medium)
)

val Typography = Typography(
    displayLarge = Typography().displayLarge.copy(fontFamily = ManropeFontFamily),
    displayMedium = Typography().displayMedium.copy(fontFamily = ManropeFontFamily),
    displaySmall = Typography().displaySmall.copy(fontFamily = ManropeFontFamily),
)