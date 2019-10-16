package com.example.testapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.items.CardItem
import com.example.testapp.items.views.CardItemView
import com.example.testapp.items.views.ItemView

class CardAdapter(private  val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items = listOf<CardItem>()

    class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        ViewHolder(CardItemView(context))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder.itemView as ItemView).apply(items[position])
    }

    fun updateCards(cards: List<CardItem>) {
        this.items = cards
        notifyDataSetChanged()
    }
}