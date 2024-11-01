package com.obedcodes.dependencyinjection.di

import android.util.Log

class SIMCard (private val serviceProvider: ServiceProvider) {


    init {
        Log.i("MYTAG", "SIMCard available")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}