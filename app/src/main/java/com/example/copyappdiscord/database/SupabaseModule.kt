package com.example.copyappdiscord.database

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import javax.inject.Singleton

//@InstallIn(SingletonComponent::class)
//@Module
//object SupabaseModule {
//
//    @Provides
//    @Singleton
//    fun provideSupabaseClient(): SupabaseClient {
//        return createSupabaseClient()
//    }
//}