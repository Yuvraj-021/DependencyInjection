package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class NotificationServiceModule (private val retryCount: Int){

    // Provides :   Provides firebase repo to the user repository. can used in the case where @inject is not used.

    @MessageQualifier
    @Provides
    fun getMessageService():NotificationService{
        return MessageService(retryCount)
    }

    @Named("Email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }

    // Binds: User Repository is binded to the sqlRepository. sqlrepository object is automatically created by using @inject

//    @Binds
//    abstract fun getEmailService(emailService: EmailService):NotificationService

}