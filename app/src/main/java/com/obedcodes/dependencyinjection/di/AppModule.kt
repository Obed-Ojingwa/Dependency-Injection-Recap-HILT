package com.obedcodes.dependencyinjection.di

import android.content.Context
import com.obedcodes.dependencyinjection.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton



@Module
@InstallIn(ActivityComponent::class)
object AppModule{
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app:Context) : BaseApplication{
        return BaseApplication()
    }

    @Singleton
    @Provides
    fun provideRandomStrings() : String{
        return "Hey look a random String : GSGCAAG GSDGAGDG"
    }
}