package com.obedcodes.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.obedcodes.dependencyinjection.di.Battery
import com.obedcodes.dependencyinjection.di.MemoryCard
import com.obedcodes.dependencyinjection.di.SIMCard
import com.obedcodes.dependencyinjection.di.ServiceProvider
import com.obedcodes.dependencyinjection.di.SmartPhone
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smartPhone = SmartPhone(Battery(),
            MemoryCard(),
            SIMCard(ServiceProvider())

        )

        smartPhone.makeCallWithRecording()


    }


}
