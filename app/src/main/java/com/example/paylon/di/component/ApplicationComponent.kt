package com.example.paylon.di.component

import com.example.paylon.PaylonApplication
import com.example.paylon.data.repository.PaylonRepository
import com.example.paylon.di.module.ApplicationModule
import dagger.Component

/**
 * Created by Akshay Sharma on 14-02-2023.
 */

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(paylonApplication: PaylonApplication)
    fun getRepo(): PaylonRepository
}