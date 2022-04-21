package com.gyp.deom0_kotlin.day02

// TODO kt32 函数类型作为返回值
fun main() {
    var studenta = Studenta("哈哈哈哈")
    println(studenta("张三", 23))

    println(Student1("123"))
    var student2 = Student2(123456)
    println(student2("aaa", "bbb", 999))
}

fun Student1(name2: String): Boolean {
    "我的名字是:$name2"
    return true
}

inline fun Student2(`count`: Int): (String, String, Int) -> String {
    println("数字为:$count")
    return { aaa: String, bbb: String, ccc: Int ->
        "aaa:$aaa bbb:$bbb  ccc:$ccc"
    }
}


//定义一个函数  函数类型为一个新的函数
inline fun Studenta(info: String): (String, Int) -> String {
    println("info:$info")
    // return  一个函数  匿名函数  函数类型就是 Studenta函数的函数类型
    return { namea: String, agea: Int ->
        "我是匿名函数，我的name是:$namea ,我的age是:$agea"
    }
}