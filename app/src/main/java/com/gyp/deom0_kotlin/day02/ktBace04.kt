package com.gyp.deom0_kotlin.day02

// TODO kt26 it关键字
fun main() {
    // 因为methodAction（） 函数 输出执行String 类型 匿名函数体中最后一行必须是String类型

    //it 关键字 就是当函数带有一个参数的时候 函数类型的名字 默认是it 是隐式的
    // 所以 当函数只有一个参数  可以默认用it来进行代替类型名字
    val methodAction: (Int) -> String = {
        "$it"
    }

    println(methodAction(11))
    //例子1
    val str1: (String) -> String = {
        "$it"  // 隐式函数调用 最后一行就是 return
    }
    println(str1("我是str1"))
}