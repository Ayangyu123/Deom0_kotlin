package com.gyp.deom0_kotlin.day02
// TODO kt23 kt语言匿名函数学习
fun main() {
    // count 函数是代表长度的意思
    var count = "匿名函数函数".count()
    println("count的文字个数有:$count 个")
    //展示匿名函数
    "123123456".count(){
        it == '6'
    }


    //打印匿名函数效果   匿名函数不要写return  因为最后一行就是返回值
    val lena="qweqasda".count(){
        //这里的it 代表函数名中的 q w e a s d
        it == 'a'
    }
    println(lena)
}