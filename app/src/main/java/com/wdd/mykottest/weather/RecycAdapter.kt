package com.wdd.mykottest.weather

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by wangdd on 2017/3/16.
 */
public class RecycAdapter(val items: List<String>) : RecyclerView.Adapter<RecycAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tv?.text = items[position]
    }

    override fun getItemCount(): Int {
         //To change body of created functions use File | Settings | File Templates.
        //   items.size
        return items.size ;
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        return  ViewHolder(TextView(parent?.context))//To change body of created functions use File | Settings | File Templates.
    }
    class ViewHolder(val tv: TextView)
        : RecyclerView.ViewHolder(tv)

}
