package com.example.paylon.di

import javax.inject.Scope

/**
 * Created by Akshay Sharma on 14-02-2023.
 */


@Scope
@Retention(AnnotationRetention.SOURCE)
annotation class ActivityScope

@Scope
@Retention(AnnotationRetention.SOURCE)
annotation class FragmentScope