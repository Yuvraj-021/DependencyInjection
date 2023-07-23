package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class UserRepositoryModule {

    // Provides :   Provides firebase repo to the user repository. can used in the case where @inject is not used.

//    @Provides
//    fun getFirebaseRepo():UserRepository{
//        return FirebaseRepository()
//    }

    // Binds: User Repository is binded to the sqlRepository. sqlrepository object is automatically created by using @inject

    @Binds
    abstract fun getSqlRepo(sqlRepository: SQLRepository):UserRepository

}