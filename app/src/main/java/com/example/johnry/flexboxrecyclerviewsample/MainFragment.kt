package com.example.johnry.flexboxrecyclerviewsample


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_main, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_list)

        val list = (0..20).toList().toIntArray().toCollection(ArrayList())
        recyclerView.adapter = FlexBoxAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(view.context, LinearLayout.VERTICAL, false)

        return view
    }
}
