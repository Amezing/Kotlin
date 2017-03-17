package com.wdd.mykottest.bean

/**一个open 可继承的类
 * Created by wangdd on 2017/2/20.
 *
 */

 open  class BaseBean( var id: Long,  var name: String)


fun print(msg : String , type : Int ?){
 if(type==null)
  System.out.print("A打印$msg");
 else
  System.out.print("B打印$msg");
}
