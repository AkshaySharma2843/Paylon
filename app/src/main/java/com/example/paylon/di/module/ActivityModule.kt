package com.example.paylon.di.module

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.paylon.data.repository.PaylonRepository
import com.example.paylon.ui.base.BaseActivity
import com.example.paylon.ui.SharedViewModel
import com.example.paylon.utils.common.ViewModelProviderFactory
import dagger.Module
import dagger.Provides

/**
 * Created by Akshay Sharma on 14-02-2023.
 */

@Module
class ActivityModule(private val activity : BaseActivity<*, *>) {

    @Provides
    fun provideContext() : Context = activity

    @Provides
    fun provideLayoutManager() : LinearLayoutManager = LinearLayoutManager(activity)

    @Provides
    fun provideMainViewModel(
    paylonRepository: PaylonRepository): SharedViewModel = ViewModelProvider(
        activity, ViewModelProviderFactory(SharedViewModel::class){
            SharedViewModel(paylonRepository)
        }).get(SharedViewModel::class.java)

}