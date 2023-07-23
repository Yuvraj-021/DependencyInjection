package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjection.databinding.ActivityMainBinding
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var userRegistrationService:UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val component=DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()
        component.inject(this)
        userRegistrationService.registerUser("yuvraj@gmail.com","12345678")
    }
}