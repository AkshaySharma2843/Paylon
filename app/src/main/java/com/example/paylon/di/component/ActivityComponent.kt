package com.example.paylon.di.component

import com.example.paylon.di.ActivityScope
import com.example.paylon.di.module.ActivityModule
import com.example.paylon.ui.beerdetails.BeerDetailsActivity
import com.example.paylon.ui.main.MainActivity
import com.example.paylon.ui.splash.SplashActivity
import dagger.Component

/**
 * Created by Akshay Sharma on 14-02-2023.
 */

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity : MainActivity)
    fun inject(activity : SplashActivity)
    fun inject(activity :BeerDetailsActivity)

}