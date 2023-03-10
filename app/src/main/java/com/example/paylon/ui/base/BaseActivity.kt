package com.example.paylon.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.example.paylon.PaylonApplication
import com.example.paylon.di.component.ActivityComponent
import com.example.paylon.di.component.DaggerActivityComponent
import com.example.paylon.di.module.ActivityModule
import javax.inject.Inject

/**
 * Created by Akshay Sharma on 14-02-2023.
 */

private typealias ActivityViewBindingInflater<VB> = (inflater: LayoutInflater) -> VB

abstract class BaseActivity<VM: BaseViewModel, VB : ViewBinding>(
    private val bindingInflater : ActivityViewBindingInflater<VB>
) : AppCompatActivity() {

    @Inject
    lateinit var viewModel: VM

    lateinit var binding: VB

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies(buildActivityComponent())
        super.onCreate(savedInstanceState)
        binding = bindingInflater.invoke(layoutInflater)
        setContentView(binding.root)
        setupView(savedInstanceState)
    }


    private fun buildActivityComponent() =
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as PaylonApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()

    protected abstract fun injectDependencies(activityComponent: ActivityComponent)
    protected abstract fun setupView(savedInstanceState: Bundle?)




}