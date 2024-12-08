package com.imanolortiz.mastermeme.ui.screens.newmeme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class NewMemeViewModel: ViewModel() {

    var state by mutableStateOf(NewMemeState())
        private set

    fun onEvent(event: NewMemeEvent){
        when(event){
            NewMemeEvent.OnAddTextClick -> state = state.copy(showTextDialog = true)
            NewMemeEvent.SaveMemeClick -> state = state.copy(showSaveOptions = true)
            NewMemeEvent.Dismiss -> state = state.copy(showSaveOptions = false, showTextDialog = false)
        }
    }

}