package com.gyp.deom0_kotlin


//TODO kt20 Noting(漏芬) 类型特点
fun main() {
star1(-1)
}

private  fun  star1(age : Int){
    when(age){
        in 0..59 -> println("分数不及格")
        in 60..80 -> println("分数及格")
        in 80..100 -> println("分数很Nice")
        -1 -> TODO("没有这种分数")
    }
}
//写一个接口例子

interface  A{
    fun show()
}
class Alac: A{
    override fun show() {
        //下面这句话不是注释  会终止程序
        TODO("Not yet implemented")
    }

}