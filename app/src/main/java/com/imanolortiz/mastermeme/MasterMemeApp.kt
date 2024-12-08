package com.imanolortiz.mastermeme

import android.app.Application
import com.imanolortiz.mastermeme.ui.screens.memes.yourMemesModule
import com.imanolortiz.mastermeme.ui.screens.newmeme.newMemeModule
import org.koin.core.context.startKoin

class MasterMemeApp: Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                yourMemesModule,
                newMemeModule
            )
        }
    }

}