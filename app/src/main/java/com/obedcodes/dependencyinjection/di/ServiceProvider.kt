package com.obedcodes.dependencyinjection.di

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){

    init {
        Log.i("MYTAG", "ServiceProvider constructed")
    }

    fun getServiceProvider(){
        Log.i("MYTAG", "Service Provider connected")
    }
}