package com.wdd.mykottest.bean

/**
 * 用编译器直接java代码转为Kotlin代码
 * Created by wangdd on 2017/2/20.
 */

class KotlinUser {
    var name: String? = null
    var age: Int = 0
    var gender: String? = null

    constructor() {}

    constructor(name: String, age: Int, gender: String) {
        this.name = name
        this.age = age
        this.gender = gender
    }

    override fun toString(): String {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}'
    }
}
