package com.example.testapp.adapter

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import kotlin.math.roundToInt

class HorizontalItemDecoration(val context: Context): RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val offset = context.resources.getDimension(R.dimen.card_vertical_offset).roundToInt()
        outRect.set(offset, 0, offset, 0)
    }
}