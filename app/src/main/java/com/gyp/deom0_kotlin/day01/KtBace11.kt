package com.gyp.deom0_kotlin


const val  age=20
const val  name="小王"
const val  stra=3.1415926

// TODO kt11 查看反编译后的字节码
fun main(): Unit {
    println(age)
    //点击Tools->Kotlin->Show kotlinBytecode 来查看编译后的字节码
    //因为kotlin代码是写完后通过反编译字节码发送给JVM虚拟机来实现
}