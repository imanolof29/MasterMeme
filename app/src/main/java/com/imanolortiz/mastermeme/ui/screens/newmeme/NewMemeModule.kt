package com.imanolortiz.mastermeme.ui.screens.newmeme

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val newMemeModule = module {
    viewModelOf(::NewMemeViewModel)
}