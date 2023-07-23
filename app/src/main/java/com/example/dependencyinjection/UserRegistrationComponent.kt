package com.example.dependencyinjection

import dagger.Component
import dagger.Module

@Component(modules =[NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {

    //fun getUserRegistrationService():UserRegistrationService

    fun inject(mainActivity: MainActivity)

}


