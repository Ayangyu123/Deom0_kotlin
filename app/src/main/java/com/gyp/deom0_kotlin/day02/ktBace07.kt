package com.gyp.deom0_kotlin.day02

// TODO kt29  kt中函数的参数函数（就是说一个函数的参数是另一个参数）
//创建两个运行时常量 模拟数据库账号密码
const val USER_NAME2 = "yangyu"
const val USER_PWD2 = "123456"

fun main() {
//kotlin 中 ==  就跟java中的equals一样
    //调用Login  并赋值账号密码
    loginApi2("yangyu", "123456") { msg: String, code: Int ->
        println("最终登录情况: msg:$msg , code:$code")
    }

}

//模仿登录API
fun loginApi2(username: String, userpwd: String, responseResult2: (String, Int) -> Any) {
    if (username == null || userpwd == null) {
        println("用户名密码为空")
        TODO("用户名密码为null")//出现问题  直接终止程序
    }

    if (username.length > 3 && userpwd.length > 3) {
        //账号密码长度符合 调用wbeServiceLoginApi 接口 并把账号密码传入 并判断账号密码登录 正确
        if (wbeServiceLoginApi2(username, userpwd))
            //调用匿名函数的 函数来赋值
            responseResult2( "login success",  200)
        else
            responseResult2("login err", 500)
    } else {
        TODO("用户名和密码不符合") //出现问题直接终止
    }
}

private fun wbeServiceLoginApi2(name: String, pwd: String): Boolean {
    return if (name == USER_NAME && pwd == USER_PWD) true else false
}

