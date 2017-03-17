package com.wdd.mykottest

/**
 * Created by wangdd on 2017/3/14.
 * Kotlin与Java 的区别
 *  */
class Kot2Java {
    /**
     * filter
     * 筛选函数将用户给定的布尔逻辑作用于集合，返回由原集合中符合条件的元素组合的一个子集

     * 获取3的倍数 filter 过滤器
     */
    /*private void data() {
        //java 代码
        int[] all = {1,2,3,4,5,6,7,8,9};
        List<Integer> filters = new ArrayList<>();
        for(int a : all) {
            if(a %3==0) {
                filters.add(a);
            }
        }
    }*/

// kotlin 代码
    val all = arrayOf(1,2,3,4,5,6,7,8,9)
    val filters = all.filter { it %3==0}//获取3的倍数
    val filternot = all.filterNot { it %2 ==0 }
    //获取不是2的倍数的
    //filternot与filter相反
//---------------------------------------------------------------

    //map 映射函数也是一个高阶函数，将一个集合经过一个传入的变换函数映射成另外一种集合
    // 将一系列的名字的长度保存到另一个数组。
    // java 代码
    /*
        String[] names = {"James","Tom","Jack","Kobe"};
        int[] namesLength =new int[names.length];
        for(int i =0; i < names.length ; i ++) {
         namesLength[i] = names[i].length();
        }
    */
    // kotlin 代码
    val names = arrayOf("James","Tom","Jack","Kobe");
    val namesLength = names.map { it.length }


    val params = mapOf("limit" to "10","offset" to "20","order" to "asc")
    val s = params.map {"${it.key}=${it.value}"}.joinToString("&")
    // s = limit=10&offset=20&order=asc

//  ---------------------------------------------------------------
    //Reduce
    //归纳函数将一个数据集合的所有元素通过传入的操作函数实现数据集合的积累叠加效果

    //假设我们需要将一首藏头诗的每句诗的第一句拿出来拼成一句话。
    // java 代码
   /* String[] texts = {"芦花丛中一扁舟","俊杰俄从此地游","义士若能知此理","反躬难逃可无忧"};
    String Buffer sb = new StringBuffer();
    for(inti =0; i < texts.length ; i ++) {
        sb.append(texts[i].substring(0,1));
    }
    String result = sb.toString();*/
// kotlin 代码
    val texts = arrayOf("芦花丛中一扁舟","俊杰俄从此地游","义士若能知此理","反躬难逃可无忧")
    val result = texts.map { it.substring(0,1) }.reduce { r, s ->"$r$s"}

}
