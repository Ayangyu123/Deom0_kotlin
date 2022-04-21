package com.gyp.deom0_kotlin

const val Str="我是编译时常量"
// TODO kt10 编译时常量
fun main(): Unit {
    //编译时常量是通过 const来修饰的
    //编译时常量 是不能在函数里面运行的   编译时常量是需要在函数外 编写
    //编译时常量只能用作基本数据类型：（String，Int，Char，Doolean，Byte，Short，Long，Double，Float）
    print(Str)
    //编译时常量为什么不能再函数中使用？ 答:如果函数之内定义就必须在运行时调用函数赋值，何来编译时常量一说
    //const val sta1="我是编译时常量 ，我需要写在方法外"
    //      val sta2 ="我是只读变量 ，我可以卸载方法内"
}