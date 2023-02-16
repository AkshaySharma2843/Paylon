package com.example.paylon.di.component

import com.example.paylon.di.FragmentScope
import com.example.paylon.di.module.FragmentModule
import dagger.Component

/**
 * Created by Akshay Sharma on 14-02-2023.
 */
@FragmentScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [FragmentModule::class]
)
interface FragmentComponent {
}