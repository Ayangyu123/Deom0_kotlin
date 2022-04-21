package com.gyp.deom0_kotlin

// TODO kt12 range函数
fun main(): Unit {

    //range函数表示一个范围区域  range(软~俺)表达式就是 ..
    //比如:
    val number=98
    if (number in  10..50){
        println("不及格")
    }else if (number in 0..9){
        println("成绩很差")
    }else if (number in 60..80){
        println("成绩一般")
    }else if (number in 90..100){
        println("成绩很棒")
    }

}