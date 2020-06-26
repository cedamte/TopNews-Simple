package com.example.topnewssimple.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.topnewssimple.BuildConfig
import com.example.topnewssimple.R
import com.example.topnewssimple.api.TopHeadlinesServices
import com.example.topnewssimple.api.retrofit
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val adapter = TopHeadlinesAdapter()
    lateinit var recyclerView: RecyclerView
    lateinit var swipeRefreshLayout: SwipeRefreshLayout

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(
        viewModelJob + Dispatchers.Main
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_topHeadlines)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter

        swipeRefreshLayout = findViewById(R.id.swipe_container)

        swipeRefreshLayout.setOnRefreshListener {
            getTopHeadlines()
            swipeRefreshLayout.isRefreshing = false
        }


        getTopHeadlines()
    }

    private fun getTopHeadlines() {
        coroutineScope.launch {
            val topHeadlines = retrofit.create(TopHeadlinesServices::class.java)
                .getTopHeadlines(mapOf("country" to "gb", "apiKey" to BuildConfig.API_KEY))

            try {
                adapter.setData(topHeadlines.articles)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}