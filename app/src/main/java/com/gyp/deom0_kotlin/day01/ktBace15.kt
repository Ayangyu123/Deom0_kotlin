package com.gyp.deom0_kotlin

// TODO  Kt15 String字符串模板
//创建一个编译时常量
const val  isLogin= false
fun main() {
    val str1="东直门地铁站 宇飞大厦"
    val str2=44
    // 如果${}符号后面有文字可以采用${}也可以中间加个空格  如果后面没有文字 可以省略花括号
    println("每天上班时间为${str2}分钟，公司地点为$str1")
    // 因为kt中的if属于表达式 可以 以这种形式出现   而Java的if 是语句是有局限性的
    println("正在判断登录是否成功:${if (isLogin) "登陆成功Login为True" else "登陆失败 Login值为False"}")
}