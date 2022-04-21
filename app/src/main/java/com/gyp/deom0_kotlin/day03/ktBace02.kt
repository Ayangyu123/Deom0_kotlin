package com.gyp.deom0_kotlin.day03

// TODO kt36  kotlin安全调用操作符
fun main() {
    //1.创建一个可空的对象
    //name 是可空类型 可能是null 如果使用name的话需要在后面加上一个？号
    var name:String?="zhangsan"
    // capitalize 这个函数代表首字母大写的意思
    //name 是可空类型 如果真的是null ？后面的代码不执行 就不会引发空指针异常
    name?.capitalize();
    name = null
    println( name?.capitalize())
}