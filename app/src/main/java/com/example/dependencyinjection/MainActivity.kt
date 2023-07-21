package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userRepository= UserRepository()
        val emailService= EmailService()
        val userRegistrationService= UserRegistrationService(userRepository,emailService)
        userRegistrationService.registerUser("yuvraj@gmail.com","12345678")
    }
}