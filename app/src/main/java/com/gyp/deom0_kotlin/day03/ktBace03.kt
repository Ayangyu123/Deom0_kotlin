package com.gyp.deom0_kotlin.day03

// TODO kt37  kotlin let函数调用
fun main() {
    // 创建一个可空变量
    var namea:String?=null
    namea = "李四"

    namea?.let {
        // let里面有一个默认的it 这个it 等同于namea
        //isBlank 判断namea是否为空
        if (namea.isBlank()){
            //如果为空 给他重新复制
            "哈哈哈哈"
        }else{
            //如果不为空返回it   it就是namea
            it
        }
    }
    println(namea)
}