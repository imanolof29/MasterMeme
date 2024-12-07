package com.imanolortiz.mastermeme.ui.screens.newmeme.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.imanolortiz.mastermeme.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewMemeTopAppBar(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    CenterAlignedTopAppBar(
        navigationIcon = {
            IconButton(
                onClick = {
                    onBackClick()
                }
            ) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back button")
            }
        },
        title = {
            Text(
                text = stringResource(id = R.string.new_meme_app_bar),
                modifier = modifier
            )
        }
    )
}