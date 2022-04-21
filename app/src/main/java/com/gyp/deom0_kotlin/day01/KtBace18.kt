package com.gyp.deom0_kotlin

// TODO kt18 具名函数参数
fun main() {
    Student(age = 19,name ="lisi",sex = '男',phonename = 1234)
}
//具名函数的意思就是 我们在给函数参数赋值的时候 可以所以指定某一个进行赋值
private  fun Student(name: String, age: Int,sex: Char,phonename:Int) {
    println("姓名:$name,年龄: $age,性别:$sex,手机号:$phonename")
}