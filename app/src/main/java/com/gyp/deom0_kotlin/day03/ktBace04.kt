package com.gyp.deom0_kotlin.day03

// TODO  kt43 截取函数subString
const val INFO = "abcd123"
fun main() {

    //subString 就是指定字符进行截取  跟java的indexof是一样的
    var indexOf = INFO.indexOf('2')
    //正常写法就是 对象.subString（从第几位开始   until  需要截取字符）
    println(INFO.substring(0 until indexOf))
} 