package com.imanolortiz.mastermeme.ui.screens.memes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.imanolortiz.mastermeme.R
import com.imanolortiz.mastermeme.ui.screens.memes.components.MemeImageCard
import com.imanolortiz.mastermeme.ui.screens.memes.components.MemesTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YourMemesScreen(
    modifier: Modifier = Modifier,
    onNewMeme: () -> Unit
) {

    var showBottomSheet by remember { mutableStateOf(false) }

    Scaffold(
        modifier = modifier,
        topBar =  { MemesTopAppBar() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    showBottomSheet = true
                }
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add button")
            }
        }
    ){ innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(stringResource(id = R.string.empty_placeholder))
        }
        if(showBottomSheet){
            ModalBottomSheet(
                onDismissRequest = {
                    showBottomSheet = false
                }
            ){
                Column(
                    modifier = modifier
                        .fillMaxSize()
                        .padding(12.dp)
                ){
                    Text(stringResource(id = R.string.modal_title), fontSize = 18.sp, fontWeight = FontWeight.W500)
                    Text(stringResource(id = R.string.modal_subtitle), fontSize = 12.sp, fontWeight = FontWeight.W400)
                    LazyVerticalGrid(
                        columns = GridCells.Adaptive(minSize = 150.dp),
                        contentPadding = PaddingValues(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(imageData) { image ->
                            MemeImageCard(
                                resource = painterResource(id = image),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .aspectRatio(1f),
                                onClick = {
                                    onNewMeme()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}