package com.gyp.deom0_kotlin.day02

// TODO kt27  函数的类型推断
fun main() {
    //括号里面的是匿名函数    双引号里面是返回类型

    //匿名函数默认推断类型为String
    //   方法名       =  类型推断返回类型
    val methodAction = {count1:Int,count2:Int->
        "两位帅哥加起来的年龄是:${count1 + count2}"
    }
    println(methodAction(11,22))


    val methodAction2 = {age: Int->"小王年龄为:${age}"}
    println(methodAction2(88))
}