package com.example.paylon.di.module

import android.content.Context
import com.example.paylon.PaylonApplication
import com.example.paylon.data.network.NetworkService
import com.example.paylon.data.network.Networking
import com.example.paylon.data.repository.PaylonRepository
import com.example.paylon.utils.network.NetworkHelper
import dagger.Module
import dagger.Provides

/**
 * Created by Akshay Sharma on 14-02-2023.
 */

@Module
class ApplicationModule(private val application: PaylonApplication) {

    @Provides
    fun provideContext() : Context = application

    @Provides
    fun provideRetrofitInstance() : NetworkService = Networking.create()

    @Provides
    fun provideNetworkHelper() = NetworkHelper(application)

    @Provides
    fun provideRepository(networkService: NetworkService, networkHelper: NetworkHelper) = PaylonRepository(networkService, networkHelper)
}