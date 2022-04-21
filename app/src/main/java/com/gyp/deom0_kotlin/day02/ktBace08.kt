package com.gyp.deom0_kotlin.day02

// TODO kt30 模拟Login简略写法
//创建两个运行时常量 模拟数据库账号密码
const val USER_NAME = "yangyu"
const val USER_PWD = "123456"

fun main() {
//kotlin 中 ==  就跟java中的equals一样
    //第一种写法
    loginApi("yangyu", "123456", { msg: String, code: Int ->
        println("最终登录情况: msg:$msg , code:$code")
    })
    //第二种写法
    loginApi("yangyu", "123456", responseResult = { msg: String, code: Int ->
        println("最终登录情况: msg:$msg , code:$code")
    })

    //  第三种写法
    //调用Login  并赋值账号密码
    loginApi("yangyu", "123456") { msg: String, code: Int ->
        println("最终登录情况: msg:$msg , code:$code")
    }

}

//模仿登录API
inline fun loginApi(username: String, userpwd: String, responseResult: (String, Int) -> Any) {
    if (username == null || userpwd == null) {
        println("用户名密码为空")
        TODO("用户名密码为null")//出现问题  直接终止程序
    }

    if (username.length > 3 && userpwd.length > 3) {
        //账号密码长度符合 调用wbeServiceLoginApi 接口 并把账号密码传入 并判断账号密码登录 正确
        if (wbeServiceLoginApi(username, userpwd))
        //调用匿名函数的 函数来赋值
            responseResult("login success", 200)
        else
            responseResult("login err", 500)
    } else {
        TODO("用户名和密码不符合") //出现问题直接终止
    }
}

fun wbeServiceLoginApi(name: String, pwd: String): Boolean {
    return name == USER_NAME && pwd == USER_PWD
}

