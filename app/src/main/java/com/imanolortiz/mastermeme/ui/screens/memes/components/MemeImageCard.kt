package com.imanolortiz.mastermeme.ui.screens.memes.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MemeImageCard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding(2.dp)
            .background(Color.Gray)
            .clip(RoundedCornerShape(12))
            .padding(2.dp)
    )
}