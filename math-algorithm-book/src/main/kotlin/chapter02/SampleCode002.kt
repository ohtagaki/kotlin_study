package chapter02

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    // 四則演算
    println(869 + 120)
    println(869 - 120)
    println(869 * 120)
    println(869 / 120)
    println(869 % 120)

    //　絶対値算出
    println(abs(45))
    println(abs(-100))

    // 累乗
    println(10.0.pow(2).toInt())
    println(3.0.pow(4).toInt())

    // ルート
    println(sqrt(5.0))
    println(sqrt(16.toDouble()))
}