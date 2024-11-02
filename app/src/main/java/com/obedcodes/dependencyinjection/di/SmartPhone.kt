package com.obedcodes.dependencyinjection.di

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(val battery:Battery, val memoryCard: MemoryCard, val simCard: SIMCard) {

    init {
        battery.getPower()
        memoryCard.getSpaceAvailability()
        simCard.getConnection()
    }

    fun makeCallWithRecording(){
        Log.i("MYTAG", "SmartPhone Calling...")
    }
}