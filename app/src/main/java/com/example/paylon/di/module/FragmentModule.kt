package com.example.paylon.di.module

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.paylon.ui.base.BaseFragment
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Akshay Sharma on 14-02-2023.
 */

@Module
class FragmentModule(private val fragment : BaseFragment<*, *>) {
    @Provides
    @Singleton
    fun provideLayoutManager() : LinearLayoutManager = LinearLayoutManager(fragment.activity)

}