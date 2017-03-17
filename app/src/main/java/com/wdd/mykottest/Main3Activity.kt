package com.wdd.mykottest

import android.app.Activity
import android.os.Bundle
import com.wdd.mykottest.Main2Activity
import com.wdd.mykottest.R
import com.wdd.mykottest.bean.User
import com.wdd.mykottest.main
import com.wdd.mykottest.toast

class Main3Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        //调用Main2Activity中的Context的扩展函数
        toast("I'm Main3")
        val arrays = listOf("name1","name2");
        main(arrays as Array<String>); //使用as强转为Array<String>
        var b:String?="abc"
        var mutlist = mutableListOf("value1","value2")
//        b = null
//        val l = b.length
//        val l = if (b != null) b.length else -1
        val l =  b?.length
        var a:String ="abc"

//       // a = null //编译出错
//        val l1 = a.length

        val users = arrayListOf(
                User("John Doe", 30,"n"),
                User("Jane Doe", 27 , "n"))
// fun arrayList<T>(vararg values: T) : ArrayList<T>

        val ages = users.map { it.age }
// users.map({ (u: User) -> u.age})
// 'it' is implicit closure parameter
// closure can be outside of parentheses

        println("Youngest user is ${ages.min()} years old")
    }
}
