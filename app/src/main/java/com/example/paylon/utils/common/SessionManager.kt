package com.example.paylon.utils.common

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
object SessionManager {
    private const val IS_USER_FIRST_TIME = "IS_USER_FIRST_TIME"


    private const val PREF_NAME = "MCHATR_PREF"


    fun sessionManager(context: Context): SharedPreferences = context.getSharedPreferences(
        PREF_NAME,
        Context.MODE_PRIVATE
    )

    private inline fun SharedPreferences.editMe(operation: (SharedPreferences.Editor) -> Unit) {
        val editMe = edit()
        operation(editMe)
        editMe.apply()
    }

    var SharedPreferences.userFirstTime
        get() = getBoolean(IS_USER_FIRST_TIME, false)
        set(value) {
            editMe {
                it.putBoolean(IS_USER_FIRST_TIME, value)
            }
        }
}