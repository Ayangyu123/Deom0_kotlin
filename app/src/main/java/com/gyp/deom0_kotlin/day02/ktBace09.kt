package com.gyp.deom0_kotlin.day02

// TODO kt31  inline关键字  内联函数
//创建两个运行时常量 模拟数据库账号密码
const val USER_NAME3 = "yangyu"
const val USER_PWD3 = "123456"

fun main() {
//kotlin 中 ==  就跟java中的equals一样
    //第一种写法
    loginApi3("yangyu", "123456", { msg: String, code: Int ->
        println("最终登录情况: msg:$msg , code:$code")
    })

}

//模仿登录API

// inline 内联函数 如果说函数的参数有lambda表达式的出现就需要声明inline函数
// 如果loginApi3这个函数不使用inline函数修饰 那在调用方（也就是main方法中调用这个LoginApi3）会生成多个对象来完成lambda的调用（会造成性能损耗）
// 如果loginApi3这个函数使用inline函数修饰，相当于C++中的 #define 宏定义 宏替换 会将代码替换到调用方  调用方就不会有任何函数的开辟 对象开辟的损耗
// 小结: 如果出现高阶函数（函数的参数是另一个函数（Lambda））就应该使用inline关键字来进行内部优化 减少函数的开辟、对象开辟的损耗


inline fun loginApi3(username: String, userpwd: String, responseResult: (String, Int) -> Any) {
    if (username == null || userpwd == null) {
        println("用户名密码为空")
        TODO("用户名密码为null")//出现问题  直接终止程序
    }

    if (username.length > 3 && userpwd.length > 3) {
        //账号密码长度符合 调用wbeServiceLoginApi 接口 并把账号密码传入 并判断账号密码登录 正确
        if (wbeServiceLoginApi3(username, userpwd))
        //调用匿名函数的 函数来赋值
            responseResult("login success", 200)
        else
            responseResult("login err", 500)
    } else {
        TODO("用户名和密码不符合") //出现问题直接终止
    }
}

fun wbeServiceLoginApi3(name: String, pwd: String): Boolean {
    return name == USER_NAME3 && pwd == USER_PWD3
}

