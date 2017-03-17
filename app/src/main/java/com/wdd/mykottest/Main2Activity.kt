package com.wdd.mykottest

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.wdd.mykottest.bean.Book
import com.wdd.mykottest.bean.User
import kotlinx.android.synthetic.main.activity_main2.*

/**
 * Kotlin 创建Kotlin Activity
 */
class Main2Activity : Activity() {
    val TAG = "Kotlin"
     override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
         //创建一个常量 User对象  Kotlin中没有new关键字
         val user= User("shenghua",34,"女");
         val user1= User("shenghua1",3,"男");

         Log.e(TAG ,"user = "+user.toString())
         //创建一个 List<User>的list集合
         val list = listOf<User>(
                 user,user1);
         //变量list集合
        //遍历list集合
         for(u in list){
             Log.d(TAG ,u.name);
         }
         //声明变量可以为空，写作 ？ 否则编译不通过
         var notnulluser : User  //= null ;
         var nulluser : User ?  ; //声明可以为空 ，赋值为null可以编译通过
         nulluser = null;
         //使用Elvis操作符给变量name赋值,?:左边的返回值不为空则返回，否则返回？：右边的值
         var name = nulluser?.name ?:null

         // !!操作符，只能确保name变量不为null的情况下才能这样写，否则会抛出空指针异常
         // 空npe(nullPointException)
         var leng=name?.length
       //  println("leng = "+leng) // name为null会抛出异常 Caused by: kotlin.KotlinNullPointerException

         val book = Book(1,"Kotlin简介" ); //val book对象不可变
         // 但是可以修改其属性值
         book.price = 3.0 //
         tv1.text = book.toString()
        // 直接调用btn2 不需要findViewById
         btn2.setOnClickListener {
             val bookName = "美好时光";
             book.name = bookName
             tv2.setTextColor(this.resources.getColor(R.color.colorAccent))
             tv2.text = user.toString();
             tv2.append("\n")
             tv2.append(book.name);
             toast("点击替换文字",Toast.LENGTH_SHORT)
         }
    }

}

/**
 * 扩展函数 定义一个Context的扩展函数
 */
public fun Context.toast(message: CharSequence,
                         duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

//    fun toast(message : String ,duration:Int = Toast.LENGTH_SHORT){
//        //message = "dd" ;//默认是常量 不可修改
//        Toast.makeText(this,message,duration).show()
//    }
