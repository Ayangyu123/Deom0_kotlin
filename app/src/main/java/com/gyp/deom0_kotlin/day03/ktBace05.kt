package com.gyp.deom0_kotlin.day03

// TODO kt39 通过if来解决判空问题

fun main() {

    // 先创建一个可空字符串
    var stra: String? = null
    //一般直接用capitalize 会报错
   // stra.capitalize()
    //第一种办法 就是在stra后面加一个？ 可空类型
    stra?.capitalize();
    println(stra)
    //第二种方法 就是通过if进行判空
    if(stra!=null){
        stra.capitalize()
    }
    println(stra)

}