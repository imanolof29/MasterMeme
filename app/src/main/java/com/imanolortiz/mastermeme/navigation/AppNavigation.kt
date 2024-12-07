package com.imanolortiz.mastermeme.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.imanolortiz.mastermeme.ui.screens.memes.YourMemesScreen
import com.imanolortiz.mastermeme.ui.screens.newmeme.NewMemeScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.YourMemeScreen
    ){
        composable<Routes.YourMemeScreen>{
            YourMemesScreen(
                onNewMeme = {
                    navController.navigate(Routes.NewMemeScreen)
                }
            )
        }
        composable<Routes.NewMemeScreen>{
            NewMemeScreen()
        }
    }
}