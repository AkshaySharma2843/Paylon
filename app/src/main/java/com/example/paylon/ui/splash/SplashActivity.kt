package com.example.paylon.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.paylon.R
import com.example.paylon.databinding.ActivitySplashBinding
import com.example.paylon.di.component.ActivityComponent
import com.example.paylon.ui.main.MainActivity
import com.example.paylon.ui.SharedViewModel
import com.example.paylon.ui.base.BaseActivity

/**
 * Created by Akshay Sharma on 15-02-2023.
 */
class SplashActivity : BaseActivity<SharedViewModel, ActivitySplashBinding>(ActivitySplashBinding::inflate) {
    override fun injectDependencies(activityComponent: ActivityComponent) = activityComponent.inject(this)

    override fun setupView(savedInstanceState: Bundle?) {

        Handler(Looper.getMainLooper()).postDelayed({
            overridePendingTransition(R.anim.left_to_right,R.anim.right_to_left)
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        },9000)

    }

}