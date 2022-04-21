package com.gyp.deom0_kotlin.day02
// TODO kt31 函数引用 ::
fun main() {
    //调用Logine函数                      :: 函数类型对象
    Logine("yangyu","123455", ::ResponseResult)
}
//创建运行时常量
const val NNAME="yangyu"
const val PPAW="123455"


// 创建ResponseResult的函数引用
fun ResponseResult(msg:String , code:Int){
    println("登录的结果是: msg:$msg code:$code")
}


//创建函数 加入内联函数
inline fun Logine(name:String,paw:String,responseResult:(String,Int)->Unit){
    if (NNAME == name && PPAW == paw){
        // 账号密码输入正确
            //调用responseResult函数来进行赋值
        responseResult("账号密码输入正确!",200)
    }else{
        // 账号密码输入错误
        responseResult("账号密码输入错误!",400)
    }
}