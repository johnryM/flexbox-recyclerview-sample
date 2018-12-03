package com.example.johnry.flexboxrecyclerviewsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_holder_item.view.*

class FlexBoxAdapter(val items: ArrayList<Int>) : RecyclerView.Adapter<FlexBoxAdapter.FlexViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): FlexViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_item, parent, false)
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