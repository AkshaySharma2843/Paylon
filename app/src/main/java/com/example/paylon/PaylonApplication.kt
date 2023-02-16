package com.example.paylon

import android.app.Application
import com.example.paylon.di.component.ApplicationComponent
import com.example.paylon.di.component.DaggerApplicationComponent
import com.example.paylon.di.module.ApplicationModule

/**
 * Created by Akshay Sharma on 14-02-2023.
 */
class PaylonApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {

        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)

    }
}