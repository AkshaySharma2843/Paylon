package com.example.paylon.ui.main

import android.app.Dialog
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.paylon.data.model.response.BeerListResponse
import com.example.paylon.databinding.ActivityMainBinding
import com.example.paylon.databinding.AppInfoDialogBinding
import com.example.paylon.di.component.ActivityComponent
import com.example.paylon.ui.SharedViewModel
import com.example.paylon.ui.base.BaseActivity
import com.example.paylon.ui.beerdetails.BeerDetailsActivity
import com.example.paylon.utils.common.SessionManager
import com.example.paylon.utils.common.SessionManager.userFirstTime
import com.example.paylon.utils.common.Status


class MainActivity : BaseActivity<SharedViewModel,ActivityMainBinding>(ActivityMainBinding::inflate), PostClickListener {

    private var page =1
    private var totalCount =20

    override fun injectDependencies(activityComponent: ActivityComponent) = activityComponent.inject(this)

    override fun setupView(savedInstanceState: Bundle?) {
        val prefs = this?.let { SessionManager.sessionManager(it) }
        if(!prefs.userFirstTime){
            setUpDialog(prefs)
        }
        viewModel.onPageCountChange(page.toString())
        viewModel.fetchData()
        setUpObserver()


    }

    private fun setUpDialog(prefs: SharedPreferences) {
        prefs?.userFirstTime = true
        val dialog = Dialog(this)
        //val alertDialogBuilder : AlertDialog.Builder = AlertDialog.Builder(this)
        dialog.setCancelable(false)
        val binding = AppInfoDialogBinding.inflate(LayoutInflater.from(this))
        dialog.setContentView(binding.root)
        binding.ivCross.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun setUpObserver() {

        viewModel.beerListLiveData.observe(this, Observer {
            when(it.status){
                Status.SUCCESS->{
                    if(it.data!=null){
                        setupRecyclerView(it.data)
                    }else
                    {
                        Toast.makeText(this,"Something Went Wrong", Toast.LENGTH_LONG).show()
                    }
                }
            }

        })

    }

    private fun setupRecyclerView(list: ArrayList<BeerListResponse>) {

        binding.recBeerList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = list?.let { MainAdapter(list,this@MainActivity) }
        }
    }

    override fun onPostClickListener(beerListResponse: BeerListResponse, position: Int) {
        startActivity(Intent(this, BeerDetailsActivity::class.java).putExtra("akshay",beerListResponse))


    }

}
