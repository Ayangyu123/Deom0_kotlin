package com.gyp.deom0_kotlin

// TODO kt16  函数头学习

fun main() {
    Student(20,"陈尚尚同鞋",'女')
}
private  fun Student(age:Int,name:String,sex:Char):Int{
    println("学生姓名:${name},学生年龄:${age},学生性别:$sex")
    return 200
}


