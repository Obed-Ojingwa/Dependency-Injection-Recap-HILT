package com.obedcodes.dependencyinjection.di

import android.util.Log

class ServiceProvider {

    init {
        Log.i("MYTAG", "ServiceProvider constructed")
    }

    fun getServiceProvider(){
        Log.i("MYTAG", "Service Provider connected")
    }
}