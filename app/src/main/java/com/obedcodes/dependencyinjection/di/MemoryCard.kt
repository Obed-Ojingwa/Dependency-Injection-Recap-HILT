package com.obedcodes.dependencyinjection.di

import android.util.Log

class MemoryCard {

    init {
        Log.i("MYTAG", "MemoryCard created")
    }

    fun getSpaceAvailability(){
        Log.i("MYTAG", "Space is available in the memory card")
    }
}