package com.wdd.mykottest.weather

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.wdd.mykottest.R
import kotlinx.android.synthetic.main.activity_weather.*

/**
 * 模拟天气预报显示
 */
class WeatherActivity : Activity() {
    private var items:List<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        init();
    }
    private fun init() {
          items = listOf(
                "Mon 3/23 - Sunny - 31/17",
                "Tue 3/24 - Foggy - 21/8",
                "Wed 3/25 - Cloudy - 22/17",
                "Thurs 3/26 - Rainy - 18/11",
                "Fri 3/27 - Foggy - 21/10",
                "Sat 3/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 3/29 - Sunny - 20/7")
        recycView.layoutManager = LinearLayoutManager(this);
        recycView.adapter = RecycAdapter(items?: listOf("null"));
    }
}
