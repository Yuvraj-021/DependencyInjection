package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}
class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.i("User","user Details saved Successfully in SQL")
    }
}

class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.i("User","user Details saved Successfully in Firebase")
    }
}