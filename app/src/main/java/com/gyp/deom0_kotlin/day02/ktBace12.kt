package com.gyp.deom0_kotlin.day02

// TODO kt34   匿名函数  具名函数
fun main() {
    // 1.匿名函数写法
    Stu1("阿钰", 23, '男', "喜欢Kotlin") {
        println("学生系统:$it")
    }
    //2.具名函数                                      :: 这个符号代表引用函数
    Stu1("阿尚", 22, '女', "喜欢吃",::showlambdaa)
}

//创建一个函数来代表这个Stu1中的lambda表达式
fun showlambdaa(stu: String) {
    println("学生系统:$stu")
}

//1 创建一个函数 参数中有lambda表达式所以开头需要用inline标签进行修饰
inline fun Stu1(name: String, age: Int, sex: Char, like: String, showlambda: (String ) -> Unit) {
    var s = "name:$name , age:$age ,sex:$sex ,like:$like"
    showlambda(s)
}