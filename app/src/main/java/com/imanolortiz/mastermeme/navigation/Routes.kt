package com.imanolortiz.mastermeme.navigation

import kotlinx.serialization.Serializable

sealed interface Routes{

    @Serializable
    data object YourMemeScreen: Routes

    @Serializable
    data object NewMemeScreen: Routes

}