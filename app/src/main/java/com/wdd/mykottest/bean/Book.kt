package com.wdd.mykottest.bean

/**
 * Created by wangdd on 2017/2/20.
 */

class Book(id: Long, name: String) : BaseBean(id, name)
{
//    init{
//
//    }
    public var price: Double = 0.toDouble()
}
