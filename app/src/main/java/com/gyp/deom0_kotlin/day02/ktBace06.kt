package com.gyp.deom0_kotlin.day02

// TODO kt28  Loambda表达式
fun main() {
   // 其实匿名函数就是 loambda表达式

    val methodAction = {count1:Int,count2:Int->
        "两位帅哥加起来的年龄是:${count1 + count2}"
    }
    println(methodAction(11,22))


    val methodAction2 = {age: Int->"小王年龄为:${age}"}
    println(methodAction2(88))

    //匿名函数  如果入参是Int       返回值可以是Int 也可以是Any
    //Loambda表达式的参数如果是Int  返回值可以是Int 也可以是Any
    //解释一下  因为 count 在kotlin中属于关键字  但是加上了``符号就变成了普通变量进行使用
    val methodAction3 ={`count`:Int->
        when(`count`){
         1->"今天是星期一"
         2->"今天是星期二"
         3->"今天是星期三"
         4->"今天是星期四"
         5->"今天是星期五"
            else -> "您输入的不符合规范"
        }
    }
    println(methodAction3(2))
}