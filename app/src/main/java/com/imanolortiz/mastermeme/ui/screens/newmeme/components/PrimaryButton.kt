package com.imanolortiz.mastermeme.ui.screens.newmeme.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(
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