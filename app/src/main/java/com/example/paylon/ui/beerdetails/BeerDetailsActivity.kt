package com.example.paylon.ui.beerdetails

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.paylon.R
import com.example.paylon.data.model.beerlist.Hop
import com.example.paylon.data.model.beerlist.Malt
import com.example.paylon.data.model.beerlist.MashTemp
import com.example.paylon.data.model.response.BeerListResponse
import com.example.paylon.databinding.ActivityBeerDetailsBinding
import com.example.paylon.di.component.ActivityComponent
import com.example.paylon.ui.SharedViewModel
import com.example.paylon.ui.base.BaseActivity
import com.example.paylon.ui.beerdetails.foodpairingadapter.FoodPairingAdapter
import com.example.paylon.ui.beerdetails.hopsadapter.HopsAdapter
import com.example.paylon.ui.beerdetails.maltadapter.MaltAdapter
import com.example.paylon.ui.beerdetails.meshtempadapter.MeshTempAdapter

/**
 * Created by Akshay Sharma on 16-02-2023.
 */
class BeerDetailsActivity : BaseActivity<SharedViewModel, ActivityBeerDetailsBinding>(ActivityBeerDetailsBinding::inflate), View.OnClickListener {

    private var beerListResponse = BeerListResponse()
    private var isGeneralDetailsClicked = false
    private var isIngredientsClicked = false
    private var isMethodClicked = false
    private var isFoodPairingClicked = false

    override fun injectDependencies(activityComponent: ActivityComponent) = activityComponent.inject(this)

    override fun setupView(savedInstanceState: Bundle?) {
        binding.clGeneralDetails.setOnClickListener(this)
        binding.clIngredientsDetails.setOnClickListener(this)
        binding.clMethodDetails.setOnClickListener(this)
        binding.clFoodPairingDetails.setOnClickListener(this)

        if (intent!=null){
            beerListResponse = intent.getSerializableExtra("akshay") as BeerListResponse
        }
        binding.tvBeerName.text = beerListResponse.name
        binding.tvBeerTagline.text = beerListResponse.tagline
        Glide.with(this)
            .load(beerListResponse.image_url)
            .into(binding.ivBeerImage)

        binding.tvDescriptionDetails.text = beerListResponse.description
        binding.tvFirstBrewedDetails.text = beerListResponse.firstBrewed
        binding.tvAbvDetails.text = beerListResponse.abv
        binding.tvIbuDetails.text = beerListResponse.ibu
        binding.tvTargetFgDetails.text = beerListResponse.target_fg
        binding.tvTargetOgDetails.text = beerListResponse.target_og
        binding.tvEbcDetails.text = beerListResponse.ebc
        binding.tvSrmDetails.text = beerListResponse.srm
        binding.tvPhDetails.text = beerListResponse.ph
        binding.tvAttenuationLevelDetails.text = beerListResponse.attenuationLevel
        binding.tvYeastDetails.text = beerListResponse.ingredients?.yeast
        binding.tvFermentationValueDetails.text = beerListResponse.method?.fermentation?.temp?.value
        binding.tvFermentationUnitDetails.text = beerListResponse.method?.fermentation?.temp?.unit
        binding.tvTwistDetails.text = beerListResponse.method?.twist
        binding.tvBrewersTipsDetails.text = beerListResponse.brewers_tips

        setUpMaltRecyclerView(beerListResponse.ingredients?.malt)
        setUpHopRecyclerView(beerListResponse.ingredients?.hops)
        setUpMashTempRecyclerView(beerListResponse.method?.mashTemp)
        setUpFoodParingRecyclerView(beerListResponse.food_pairing)


    }

    private fun setUpFoodParingRecyclerView(foodPairing: ArrayList<String>?) {
        binding.recFoodPairing.apply {
            layoutManager = LinearLayoutManager(this@BeerDetailsActivity)
            adapter = foodPairing?.let { FoodPairingAdapter(foodPairing) }
        }

    }

    private fun setUpMashTempRecyclerView(mashTemp: ArrayList<MashTemp>?) {
        binding.recMashTemp.apply {
            layoutManager = LinearLayoutManager(this@BeerDetailsActivity)
            adapter = mashTemp?.let { MeshTempAdapter(mashTemp) }
        }

    }

    private fun setUpHopRecyclerView(hops: ArrayList<Hop>?) {
        binding.recHops.apply {
            layoutManager = LinearLayoutManager(this@BeerDetailsActivity)
            adapter = hops?.let { HopsAdapter(hops) }
        }
    }

    private fun setUpMaltRecyclerView(malt: ArrayList<Malt>?) {
        binding.recMalt.apply {
            layoutManager = LinearLayoutManager(this@BeerDetailsActivity)
            adapter = malt?.let { MaltAdapter(malt) }
        }

    }

    override fun onClick(view: View?) {
        when(view?.id){

            R.id.cl_general_details ->{
                if(!isGeneralDetailsClicked){
                    binding.clGeneralDetailsMain.visibility =View.VISIBLE
                    binding.ivGeneralDetailsUpArrow.visibility = View.VISIBLE
                    binding.ivGeneralDetailsDownArrow.visibility = View.GONE
                    isGeneralDetailsClicked = true
                }else{
                    binding.clGeneralDetailsMain.visibility =View.GONE
                    binding.ivGeneralDetailsUpArrow.visibility = View.GONE
                    binding.ivGeneralDetailsDownArrow.visibility = View.VISIBLE
                    isGeneralDetailsClicked = false
                }
            }

            R.id.cl_ingredients_details->{
                if(!isIngredientsClicked){
                    binding.clIngredientsMain.visibility =View.VISIBLE
                    binding.ivIngredientsUpArrow.visibility = View.VISIBLE
                    binding.ivIngredientsDownArrow.visibility = View.GONE
                    isIngredientsClicked = true
                }else{
                    binding.clIngredientsMain.visibility =View.GONE
                    binding.ivIngredientsUpArrow.visibility = View.GONE
                    binding.ivIngredientsDownArrow.visibility = View.VISIBLE
                    isIngredientsClicked = false
                }
            }

            R.id.cl_method_details->{
                if(!isMethodClicked){
                    binding.clMethodMain.visibility =View.VISIBLE
                    binding.ivMethodUpArrow.visibility = View.VISIBLE
                    binding.ivMethodDownArrow.visibility = View.GONE
                    isMethodClicked = true
                }else{
                    binding.clMethodMain.visibility =View.GONE
                    binding.ivMethodUpArrow.visibility = View.GONE
                    binding.ivMethodDownArrow.visibility = View.VISIBLE
                    isMethodClicked = false
                }

            }

            R.id.cl_food_pairing_details->{
                if(!isFoodPairingClicked){
                    binding.clFoodPairingMain.visibility =View.VISIBLE
                    binding.ivFoodPairingUpArrow.visibility = View.VISIBLE
                    binding.ivFoodPairingDownArrow.visibility = View.GONE
                    isFoodPairingClicked = true
                }else{
                    binding.clFoodPairingMain.visibility =View.GONE
                    binding.ivFoodPairingUpArrow.visibility = View.GONE
                    binding.ivFoodPairingDownArrow.visibility = View.VISIBLE
                    isFoodPairingClicked = false
                }
            }


        }
    }
}