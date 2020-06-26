package com.example.topnewssimple.api

import com.example.topnewssimple.BuildConfig
import com.example.topnewssimple.data.topheadlines.TopHeadlines
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface TopHeadlinesServices {
    @GET(BuildConfig.TOP_HEADLINES_ENDPOINT)
    suspend fun getTopHeadlines(@QueryMap(encoded = false) filters: Map<String, String>): TopHeadlines
}

val loggingInterceptor = HttpLoggingInterceptor().setLevel(
    HttpLoggingInterceptor.Level.BASIC
)

val okHttpClient = OkHttpClient.Builder()
    .addInterceptor(loggingInterceptor)
    .build()


val retrofit: Retrofit = Retrofit.Builder().baseUrl(BuildConfig.BASE_URL)
    .client(okHttpClient)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()
