package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjection.databinding.ActivityMainBinding
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val userRegistrationService=DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        userRegistrationService.registerUser("yuvraj@gmail.com","12345678")
    }
}