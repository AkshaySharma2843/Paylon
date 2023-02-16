package com.example.paylon.utils.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

/**
 * Created by Akshay Sharma on 14-02-2023.
 */
class NetworkHelper(private val context : Context) {

    fun isNetworkAvailable(): Boolean {
        val mConnectivityManager = context
            .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (mConnectivityManager != null) {
            val mNetworkInfos = mConnectivityManager.allNetworkInfo
            if (mNetworkInfos != null) {
                for (mNetworkInfo in mNetworkInfos) {
                    if (mNetworkInfo.state == NetworkInfo.State.CONNECTED) {
                        return true
                    }
                }
            }
        }
        return false
    }
}