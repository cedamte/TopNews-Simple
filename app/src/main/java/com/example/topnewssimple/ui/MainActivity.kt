package com.example.topnewssimple.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.topnewssimple.R
import com.example.topnewssimple.data.topheadlines.Article.Companion.dummyArticle

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = TopHeadlinesAdapter()

        recyclerView = findViewById(R.id.rv_topHeadlines)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter

        adapter.setData(dummyArticle)


    }
}