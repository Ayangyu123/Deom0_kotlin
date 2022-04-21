package com.gyp.deom0_kotlin.day02

// TODO kt25 函数参数学习
fun main() {
    // 因为methodAction（） 函数 输出执行String 类型 匿名函数体中最后一行必须是String类型
    val methodAction: (Int,Int,Int) -> String = {number1,number2,number3->
        var lena=9999
        "$lena  $number1 $number2 $number3"
    }

    println(methodAction(11,22,33))
}