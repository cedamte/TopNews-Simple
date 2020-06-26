package com.example.topnewssimple.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.topnewssimple.BuildConfig
import com.example.topnewssimple.R
import com.example.topnewssimple.api.TopHeadlinesServices
import com.example.topnewssimple.api.retrofit
import com.example.topnewssimple.data.topheadlines.TopHeadlines
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val adapter = TopHeadlinesAdapter()
    lateinit var recyclerView: RecyclerView
    lateinit var swipeRefreshLayout: SwipeRefreshLayout


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
        retrofit.create(TopHeadlinesServices::class.java)
            .getTopHeadlines(mapOf("country" to "gb", "apiKey" to BuildConfig.API_KEY))
            .enqueue(object : Callback<TopHeadlines> {
                override fun onFailure(call: Call<TopHeadlines>, t: Throwable) {
                    Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG)
                        .show()

                }

                override fun onResponse(
                    call: Call<TopHeadlines>,
                    response: Response<TopHeadlines>
                ) {
                    response.body()?.articles?.let { adapter.setData(it) }

                }

            })
    }
}