package com.imanolortiz.mastermeme.ui.screens.newmeme.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    Button(
        modifier= modifier,
        shape = RoundedCornerShape(8f),
        onClick = {
            onClick()
        }
    ) {
        Text(text)
    }
}