package com.obedcodes.dependencyinjection.di

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {


    init {
        Log.i("MYTAG", "SIMCard available")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}