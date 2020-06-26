package com.example.topnewssimple.data.topheadlines


import com.squareup.moshi.Json

data class TopHeadlines(
    @Json(name = "articles")
    val articles: List<Article>,
    @Json(name = "status")
    val status: String,
    @Json(name = "totalResults")
    val totalResults: Int
)