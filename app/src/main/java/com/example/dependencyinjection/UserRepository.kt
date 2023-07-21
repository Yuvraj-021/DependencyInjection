package com.example.dependencyinjection

import android.util.Log

class UserRepository {
    fun saveUser(email: String, password: String) {
        Log.i("User","user Details saved Successfully")
    }
}