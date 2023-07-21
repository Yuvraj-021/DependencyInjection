package com.example.dependencyinjection

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email:String, password:String){
        userRepository.saveUser(email,password)
        emailService.sendEmail(email,"yuvraj","User Registered Successfully!!")

    }

}