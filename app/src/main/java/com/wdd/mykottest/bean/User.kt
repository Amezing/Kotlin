package com.wdd.mykottest.bean

import android.content.Context
import android.widget.Toast

/**
 * Created by wangdd on 2017/2/20.
 *
 * 数据类是一种非常强大的类，它可以让你避免创建Java中的用于保存状态但又操作
非常简单的POJO的模版代码
 */

data class User
( var name: String,
  var age: Int,
  var gender: String)



