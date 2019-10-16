package com.example.testapp.items

abstract class Item(val type: Int) {

    companion object {
        const val TYPE_CARD = 1
        const val TYPE_REGULAR = 0
    }

    abstract fun areItemsTheSame(oldItem: Item): Boolean
    abstract fun areContentsTheSame(oldItem: Item): Boolean
}