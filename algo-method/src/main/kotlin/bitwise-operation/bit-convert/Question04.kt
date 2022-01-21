package `bitwise-operation`.`bit-convert`

import kotlin.math.*

// 問題
// https://algo-method.com/tasks/166

fun main() {
    val N = readLine()!!.toInt()
    // Math.pow：べき乗
    val ans = 2.0.pow(N.toDouble()).toInt()
    // Int.toString(radix) を使用すると、数値 (Int) を任意の基数の文字列表現に変換する
    println(ans.toString(2))
}
