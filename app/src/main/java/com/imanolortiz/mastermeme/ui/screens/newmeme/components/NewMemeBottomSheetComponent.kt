package com.imanolortiz.mastermeme.ui.screens.newmeme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.imanolortiz.mastermeme.ui.screens.newmeme.NewMemeBottomSheetOption

@Composable
fun NewMemeBottomSheetComponent(
    modifier: Modifier = Modifier,
    option: NewMemeBottomSheetOption
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(option.icon, contentDescription = "option icon")
        Column(
            modifier = Modifier.padding(start = 8.dp)
        ){
            Text(option.title, fontSize = 14.sp)
            Text(option.description, fontSize = 12.sp)
        }
    }
}