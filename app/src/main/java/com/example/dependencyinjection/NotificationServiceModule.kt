package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class NotificationServiceModule {

    // Provides :   Provides firebase repo to the user repository. can used in the case where @inject is not used.

//    @Provides
//    fun getMessageService():NotificationService{
//        return MessageService()
//    }

    // Binds: User Repository is binded to the sqlRepository. sqlrepository object is automatically created by using @inject
//
    @Binds
    abstract fun getEmailService(emailService: EmailService):NotificationService

}