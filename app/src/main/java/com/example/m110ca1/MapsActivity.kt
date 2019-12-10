package com.example.m110ca1

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val uty = LatLng(-7.747033, 110.355398)
        mMap.addMarker(MarkerOptions().position(uty).title("Universitas Teknologi Yogyakarta").snippet("-7.747033, 110.355398"))


        val arcdetriomphe = LatLng(48.8738, 2.2950)
        mMap.addMarker(MarkerOptions().position(arcdetriomphe).title("Arc de Triomphe"). snippet("48.8738, 2.2950"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(arcdetriomphe))

        val hmsbelfast = LatLng (51.5066, -0.0814)
        mMap.addMarker(MarkerOptions().position(hmsbelfast).title("HMS Belfast"). snippet("Town Class Light Cruiser, Retired. Museum"))



        val ussmassachusetts = LatLng (41.7068, -71.1630)
        mMap.addMarker(MarkerOptions().position(ussmassachusetts).title("USS Massachusetts BB59 Museum"). snippet("South Dakota Class Battleship, Retired. Museum"))

        val ussiowa = LatLng (33.7423, -118.2773)
        mMap.addMarker(MarkerOptions().position(ussiowa).title("USS Iowa BB61 Museum"). snippet("Iowa Class Battleship, Retired. Museum"))
    }


}


