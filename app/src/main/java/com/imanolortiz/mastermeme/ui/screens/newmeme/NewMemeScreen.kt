package com.imanolortiz.mastermeme.ui.screens.newmeme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.imanolortiz.mastermeme.ui.screens.newmeme.components.NewMemeTopAppBar

@Composable
fun NewMemeScreen(
    modifier: Modifier = Modifier,
    meme: Int,
    onBackClick: () -> Unit
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            NewMemeTopAppBar(
                onBackClick = {
                    onBackClick()
                }
            )
        }
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Nuevo meme $meme")
        }
    }
}