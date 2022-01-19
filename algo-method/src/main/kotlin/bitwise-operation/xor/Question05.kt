package `bitwise-operation`.xor

import kotlin.math.pow

// 問題
// https://algo-method.com/tasks/182

fun main() {
    val(A, N) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val a = A.toString(2).toInt(2)
    val num = 2.0.pow(N).toInt()
    println((a xor num).toInt())
}
