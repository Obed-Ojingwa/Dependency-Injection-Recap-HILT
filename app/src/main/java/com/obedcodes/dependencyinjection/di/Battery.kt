package com.obedcodes.dependencyinjection.di

import android.util.Log

class Battery {

    init {
        Log.i("MYTAG", "Battery created")

    }

    fun getPower(){
        Log.i("MYTAG", "Power available")
    }
}
