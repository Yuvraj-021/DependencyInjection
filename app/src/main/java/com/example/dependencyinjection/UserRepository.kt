package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String) {
        Log.i("User","user Details saved Successfully")
    }
}