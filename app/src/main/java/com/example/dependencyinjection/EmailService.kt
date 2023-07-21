package com.example.dependencyinjection

import android.util.Log

class EmailService {
    fun sendEmail(to: String, from: String, message: String) {
        Log.i("User","Email Sent")
    }
}