package com.gyp.deom0_kotlin.day03

// TODO kt35  kotlin可空性特点
fun main() {
    // 一般我们创建对象的时候是不能直接赋空值的
    var name = "张三"
    //Null can not be a value of a non-null type String   当前对象不能赋值为空
    // name =null
    println(name)


    //第二种情况：可以赋值为空
    //直接在类型后面加一个？  代表可空变量
    var name2: String?
    name2 = "李四"
    name2 = null
    println(name2)
}