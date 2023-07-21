package com.example.dependencyinjection

class UserRegistrationService(
    private val userRepository: UserRepository = UserRepository(),
    private val emailService: EmailService = EmailService()
) {

    fun registerUser(email:String, password:String){
        userRepository.saveUser(email,password)
        emailService.sendEmail(email,"yuvraj","User Registered Successfully!!")

    }

}