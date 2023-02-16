package com.example.paylon.data.network

import com.example.paylon.BuildConfig
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Akshay Sharma on 14-02-2023.
 */
object Networking {

    fun create() : NetworkService{
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(
                        HttpLoggingInterceptor()
                            .apply {
                                level = HttpLoggingInterceptor.Level.BODY
                            })
                    .build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(NetworkService::class.java)
    }

}