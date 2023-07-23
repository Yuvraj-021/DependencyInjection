package com.example.dependencyinjection

import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class MessageQualifier()
