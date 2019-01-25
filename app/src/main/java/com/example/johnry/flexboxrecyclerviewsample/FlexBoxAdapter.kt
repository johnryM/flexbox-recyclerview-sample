package com.example.johnry.flexboxrecyclerviewsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.flexbox.FlexboxLayoutManager
import kotlinx.android.synthetic.main.view_holder_item.view.*

class FlexBoxAdapter(val items: ArrayList<Int>) : RecyclerView.Adapter<FlexBoxAdapter.FlexViewHolder>() {

    companion object {
        const val ONE_PER_ROW = 1
        const val TWO_PER_ROW = 2
    }

    override fun getItemViewType(position: Int): Int {
//        return if (position == 5) {
//            ONE_PER_ROW
//        } else {
//            TWO_PER_ROW
//        }
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlexViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_item, parent, false)

        if (view.layoutParams is FlexboxLayoutManager.LayoutParams) {
//            val lp = view.layoutParams as FlexboxLayoutManager.LayoutParams

            if (viewType == ONE_PER_ROW) {
                (view.layoutParams as FlexboxLayoutManager.LayoutParams).flexBasisPercent = 1.0f
            } else {
                (view.layoutParams as FlexboxLayoutManager.LayoutParams).flexBasisPercent = 0.5f
            }
        }


        return FlexViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: FlexViewHolder, p1: Int) {
        p0.bind(items[p1])
    }

    class FlexViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val v = view
        fun bind(num : Int) {
            v.item.text = num.toString()
        }
    }
}