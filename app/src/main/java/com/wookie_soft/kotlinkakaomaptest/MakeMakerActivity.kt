package com.wookie_soft.kotlinkakaomaptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import com.wookie_soft.kotlinkakaomaptest.databinding.ActivityMakeMakerBinding
import net.daum.mf.map.api.MapPoint
import net.daum.mf.map.api.MapView

class MakeMakerActivity : AppCompatActivity() {
    val binding:ActivityMakeMakerBinding by lazy { ActivityMakeMakerBinding.inflate(layoutInflater) }
    lateinit var mapView: MapView
    val lat: Double = 0.0
    val lng: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val secondIntent = intent
        intent.getDoubleExtra("lat",lat)
        intent.getDoubleExtra("lng",lng)

        mapView = MapView(this)
        val mapViewContainer: ViewGroup = binding.mapview
        mapViewContainer.addView(mapView)

//        mapView.setMapCenterPoint(
//            MapPoint.mapPointWithGeoCoord(
//                lat,
//                lng
//            ),true )



    }
}