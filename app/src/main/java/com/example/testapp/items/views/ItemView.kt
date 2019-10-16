package com.example.testapp.items.views

import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.testapp.R
import com.example.testapp.items.CardItem
import com.example.testapp.items.Item
import java.lang.Exception

abstract class ItemView(context: Context, @LayoutRes layoutId: Int) : FrameLayout(context) {

    init{
        LayoutInflater.from(context).inflate(layoutId, this, true)

        this.layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
    }

    abstract fun apply(item: Item)
}

class CardItemView(context: Context): ItemView(context, R.layout.card_item) {

    private val titleTextView = findViewById<TextView>(R.id.cardTitleTextView)
    private val contentTextView = findViewById<TextView>(R.id.cardContentTextView)

    override fun apply(item: Item) {
        if(item !is CardItem) throw Exception("Invalid ItemType!!")

        titleTextView.text = item.title
        contentTextView.text = item.content
    }

}

//todo implement this shit later!!
class RegularItemView(context: Context): ItemView(context, R.layout.card_item) {
    override fun apply(item: Item) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}