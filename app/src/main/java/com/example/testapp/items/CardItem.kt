package com.example.testapp.items

data class CardItem(val title: String, val content: String): Item(TYPE_CARD) {

    override fun areItemsTheSame(oldItem: Item): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun areContentsTheSame(oldItem: Item): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}