package com.gyp.deom0_kotlin

// TODO  Kt14 when表达式
fun main() {
    // Java 中 if 代表语句没有返回值
    // Kotlin 中 if 代表表达式 有返回值（when也是表达式  也有返回值）

    val nume = 123

    // Kotlin中的 Any 类型 == Java中的Object类型
    val info = when (nume) {
        1 -> "今天星期一"
        2 -> "今天星期二"
        3 -> "今天星期三"
        4 -> "今天星期四"
        5 -> "今天星期五"
        6 -> "今天星期六"
        7 -> "今天星期日"
        8 -> true
        else ->{
            println("输入的啥也不是 ")
        }
    }
    //如果else返回的是字符串类型 那么这个info就是字符串类型
    //如果返回的是一个true 那么这个info就是Boolean类型
    println(info)
}