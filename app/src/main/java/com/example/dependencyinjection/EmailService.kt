package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun sendEmail(to: String, from: String, message: String) {
        Log.i("User","Email Sent")
    }
}