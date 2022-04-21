package com.gyp.deom0_kotlin.day02

// TODO kt24 函数类型和隐式返回
fun main() {
    // 因为methodAction（） 函数 输出执行String 类型 匿名函数体中最后一行必须是String类型
    val methodAction: () -> String
    // 匿名函数体
    methodAction = {
        //第一行为变量  跟输入的类型String不匹配报错  如果String类型为Any类型 123456 不报错
        val lena=123456
        //匿名函数体中的最后一行为String 类型 匹配不报错
       "$lena AAA"
    }
    println(methodAction())
}