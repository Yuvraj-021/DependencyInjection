package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject



interface NotificationService {
    fun send(to: String, from: String, message: String)
}
class EmailService @Inject constructor() :NotificationService{
    override fun send(to: String, from: String, message: String) {
        Log.i("User","Email Sent")
    }
}

class MessageService(private val retryCount :Int) : NotificationService{
    override fun send(to: String, from: String, message: String) {
        Log.i("User","Message Sent - Retry count $retryCount")
    }
}