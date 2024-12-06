package com.imanolortiz.mastermeme.ui.screens.memes.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.imanolortiz.mastermeme.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MemesTopAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.top_app_bar),
                modifier = modifier
            )
        },
    )
}