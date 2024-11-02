package com.obedcodes.dependencyinjection.di

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){

    init {
        Log.i("MYTAG", "Battery created")

    }

    fun getPower(){
        Log.i("MYTAG", "Power available")
    }
}
