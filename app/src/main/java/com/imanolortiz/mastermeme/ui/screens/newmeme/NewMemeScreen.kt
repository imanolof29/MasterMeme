package com.imanolortiz.mastermeme.ui.screens.newmeme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.imanolortiz.mastermeme.R
import com.imanolortiz.mastermeme.ui.screens.newmeme.components.NewMemeBottomSheetComponent
import com.imanolortiz.mastermeme.ui.screens.newmeme.components.NewMemeTopAppBar
import com.imanolortiz.mastermeme.ui.screens.newmeme.components.PrimaryButton
import com.imanolortiz.mastermeme.ui.screens.newmeme.components.SecondaryButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewMemeScreen(
    modifier: Modifier = Modifier,
    meme: Int,
    onBackClick: () -> Unit
) {

    var showBottomSheet by remember { mutableStateOf(false) }

    var openAlertDialog by remember { mutableStateOf(false) }

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
                PrimaryButton(
                    onClick = {
                        openAlertDialog = true
                    },
                    text = "Add text"
                )
                SecondaryButton(
                    onClick = {
                        showBottomSheet = true
                    },
                    text = "Save meme"
                )
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
        if(openAlertDialog){
            AlertDialog(
                onDismissRequest = { openAlertDialog = false },
                title = {
                     Text(stringResource(id = R.string.add_text_dialog))
                },
                text = {
                    OutlinedTextField(
                        value = "",
                        onValueChange = {  },
                        placeholder = {
                            Text(
                                stringResource(
                                    id = R.string.tap_twice
                                )
                            )
                        }
                    )
                },
                confirmButton = {
                    TextButton(
                        onClick = { openAlertDialog = false }
                    ){
                        Text(stringResource(id = R.string.ok))
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = { openAlertDialog = false }
                    ){
                        Text(stringResource(id = R.string.cancel))
                    }
                }
            )
        }
        if(showBottomSheet){
            ModalBottomSheet(
                onDismissRequest = {
                    showBottomSheet = false
                }
            ){
                Column(
                    modifier = modifier
                        .padding(12.dp)
                ){
                    NewMemeBottomSheetComponent(
                        option = NewMemeBottomSheetOption(
                            title = stringResource(R.string.save_device_title),
                            description = stringResource(R.string.save_device_description),
                            icon = Icons.Default.Add
                        )
                    )
                    NewMemeBottomSheetComponent(
                        option = NewMemeBottomSheetOption(
                            title = stringResource(R.string.share_meme_title),
                            description = stringResource(R.string.share_meme_description),
                            icon = Icons.Default.Share
                        )
                    )
                }
            }
        }
    }
}