package `bitwise-operation`.and

import kotlin.math.pow

fun main() {
    val (A, N) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val a = A.toString(2).toInt(2)
    val num = 2.0.pow(N).toInt().toString(2).toInt(2)
    println((a and num).toInt())
}