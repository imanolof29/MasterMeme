package com.imanolortiz.mastermeme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.imanolortiz.mastermeme.navigation.type.createNavType
import com.imanolortiz.mastermeme.ui.screens.memes.YourMemesScreen
import com.imanolortiz.mastermeme.ui.screens.newmeme.NewMemeScreen
import kotlin.reflect.typeOf

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = YourMemeScreen
    ){
        composable<YourMemeScreen>{
            YourMemesScreen(
                onNewMeme = { meme ->
                    navController.navigate(NewMemeScreen(meme = meme))
                }
            )
        }
        composable<NewMemeScreen>(typeMap = mapOf(typeOf<NewMemeScreen>() to createNavType<NewMemeScreen>())){ backStackEntry ->
            val newMeme: NewMemeScreen = backStackEntry.toRoute()
            NewMemeScreen(
                meme = newMeme.meme,
                onBackClick = {
                    navController.navigateUp()
                }
            )
        }
    }
}