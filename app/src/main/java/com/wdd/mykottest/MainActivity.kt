package com.wdd.mykottest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

import com.wdd.mykottest.bean.User
import com.wdd.mykottest.weather.WeatherActivity

/**
 * mainActivity for android
 * Android原生Activity代码
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val btn2 = findViewById(R.id.btn2) as Button
        btn2.setOnClickListener {
            Toast.makeText(this@MainActivity, "点击按钮", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainActivity, WeatherActivity::class.java))
        }
    }

    /**
     * 点击按钮进入另一个Activity
     * @param v
     */
    fun OnSgape(v: View) {
        startActivity(Intent(this, Main2Activity::class.java))
    }

    fun OnLog(v: View) {
        Toast.makeText(this, "user=" + User("user1", 12, "nv").toString(), Toast.LENGTH_SHORT).show()
    }

    private fun data() {
        val names = arrayOf("James", "Tom", "Jack", "Kobe")
        val namesLength = IntArray(names.size)
        for (i in names.indices) {
            namesLength[i] = names[i].length
        }
    }

    companion object {

        private val TAG = "MainActivity"
    }


}
