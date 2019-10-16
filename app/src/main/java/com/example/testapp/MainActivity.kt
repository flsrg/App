package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.adapter.CardAdapter
import com.example.testapp.adapter.HorizontalItemDecoration
import com.example.testapp.items.CardItem

class MainActivity : AppCompatActivity() {

    private val cardRecycler by lazy {findViewById<RecyclerView>(R.id.recyclerCard)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardAdapter = CardAdapter(this)
        cardRecycler.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)

            this.adapter = cardAdapter
            setHasFixedSize(true)
            addItemDecoration(HorizontalItemDecoration(this@MainActivity))
        }

        cardAdapter.updateCards(listOf(CardItem("FUCK", "this is test content for this card"),
            CardItem("NEXT CARD", "poprikolu description for the card ne zavezli"),
            CardItem("NOT SUPPORTED", "cooming soon, cooming soon, cooming soon, cooming soon")
        ))

        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        motionLayout.setTransitionListener(object : TransitionAdapter() {
            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                when (currentId) {
                    R.id.mainEnd -> {
                        //todo make fragment transaction main_field_fragment.xml
                    }
                }
            }
        })
    }
}
