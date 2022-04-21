package com.gyp.deom0_kotlin

import com.gyp.deom0_kotlin.day01.ktBace211

// TODO  kt20  反引号中函数的特点
fun main() {
    //因为 123456的这个函数被反引号进行编译
    //第一种调用方式  直接调用
    `123456`("张三",90)
    //第二种调用方式
    //因为kt中的关键字  在java中就是普通的变量名（ in  is 在kotlin中就是关键字  所以需要通过反引号进行改变成普通函数名来使用）
    ktBace211.`in`()
    ktBace211.`is`()
    //第三种调用方式
    //可以作为加密用
    `12353sdasda13215134123`("机密文件1")
    `dasdaw4rw1344131513123`(213)

}

//
private fun `123456`(name: String, age : Int){
    println("姓名为: $name,年龄为: $age")
}

//公司有一套自己定义的编码格式来进行翻译这些函数名
private fun `12353sdasda13215134123`(name: String){
    println("$name")
}
private fun `dasdaw4rw1344131513123`(age : Int){
    println("$age")
}