package com.example.testapp.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.adapter.CardAdapter
import com.example.testapp.adapter.HorizontalItemDecoration
import com.example.testapp.items.CardItem

class MainFieldActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main_field)

        val cardAdapter = CardAdapter(this)

        findViewById<RecyclerView>(R.id.recyclerCard).apply {
            layoutManager =
                LinearLayoutManager(this@MainFieldActivity, LinearLayoutManager.HORIZONTAL, false)

            this.adapter = cardAdapter
            setHasFixedSize(true)
            addItemDecoration(HorizontalItemDecoration(this@MainFieldActivity))
        }

        cardAdapter.updateCards(listOf(
            CardItem("FUCK", "this is test content for this card"),
            CardItem("NEXT CARD", "poprikolu description for the card ne zavezli"),
            CardItem("NOT SUPPORTED", "cooming soon, cooming soon, cooming soon, cooming soon")
        ))
    }
}