package com.imanolortiz.mastermeme.ui.screens.newmeme

sealed interface NewMemeEvent {
    data object OnAddTextClick: NewMemeEvent
    data object SaveMemeClick: NewMemeEvent
    data object Dismiss: NewMemeEvent
}