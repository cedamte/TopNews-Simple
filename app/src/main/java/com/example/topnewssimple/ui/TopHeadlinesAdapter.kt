package com.example.topnewssimple.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.topnewssimple.R
import com.example.topnewssimple.data.topheadlines.Article
import kotlinx.android.synthetic.main.list_articles.view.*

class TopHeadlinesAdapter : RecyclerView.Adapter<TopHeadlinesAdapter.ViewHolder>() {
    private val articlesList: MutableList<Article> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_articles, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articlesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = articlesList[position].title
        holder.subtitle.text = articlesList[position].content
        holder.pubDate.text = articlesList[position].publishedAt
    }

    fun setData(articles: List<Article>) {
        articlesList.clear()
        articlesList.addAll(articles)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.tv_title
        val subtitle: TextView = itemView.tv_subtitle
        val pubDate: TextView = itemView.tv_pubDate
    }
}