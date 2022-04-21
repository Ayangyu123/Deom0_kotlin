package com.gyp.deom0_kotlin


// TODO  kt17 函数中的默认值
fun main() {
    // 调用后进行赋值
    action1("张三",88)
    // 因为有默认值也可以不用  去赋值
    action2()
    //有默认值  也可以进行赋值 替换掉之前的默认值
    action3("哎哎哎",14)
}
// 没有默认值  等待调用时候进行赋值
private fun action1(name: String,age :Int){
    println("姓名是:$name,年龄是:$age")
}
// 有默认值  等待调用时候可以不用赋值
private fun action2(name: String = "李四",age :Int = 78){
    println("姓名是:$name,年龄是:$age")
}
// 有默认值  等待调用时候可以不用赋值
private fun action3(name: String = "王五",age :Int = 38){
    println("姓名是:$name,年龄是:$age")
}