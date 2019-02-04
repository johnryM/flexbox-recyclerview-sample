package com.example.johnry.flexboxrecyclerviewsample


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.google.android.flexbox.FlexboxLayoutManager
import kotlinx.android.synthetic.main.fragment_main.*
import com.google.android.flexbox.JustifyContent
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxItemDecoration


class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_main, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_list)

        val list = (0..33).toList().toIntArray().toCollection(ArrayList())
        recyclerView.adapter = FlexBoxAdapter(list)

        val flexLayoutManager = FlexboxLayoutManager(context)
        flexLayoutManager.flexDirection = FlexDirection.ROW
        flexLayoutManager.justifyContent = JustifyContent.FLEX_START
        recyclerView.layoutManager = flexLayoutManager
        recyclerView.layoutManager =  flexLayoutManager
        val fli = FlexboxItemDecoration(activity)
        fli.setDrawable(resources.getDrawable(R.drawable.divider))
        recyclerView.addItemDecoration(fli)

        return view
    }
}
