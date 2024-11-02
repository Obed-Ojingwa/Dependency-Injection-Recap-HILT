package com.obedcodes.dependencyinjection.di

import dagger.Component


@Component
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}