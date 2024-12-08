package com.imanolortiz.mastermeme.ui.screens.newmeme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.imanolortiz.mastermeme.ui.screens.newmeme.components.NewMemeTopAppBar
import com.imanolortiz.mastermeme.ui.screens.newmeme.components.PrimaryButton
import com.imanolortiz.mastermeme.ui.screens.newmeme.components.SecondaryButton

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
        },
        bottomBar = {
            BottomAppBar{
                PrimaryButton(onClick = {}, text = "Add text")
                SecondaryButton(onClick = {}, text = "Save meme")
            }
        }
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = meme),
                contentDescription = "image",
                contentScale = ContentScale.Crop
            )
        }
    }
}