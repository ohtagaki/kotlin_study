package `everyDay-algoMethod`.sequence

import kotlin.math.pow

// 問題
// https://algo-method.com/tasks/655

fun main() {
    val N = readLine()!!.toLong()
    val answer = 2.0.pow(N.toDouble()).toLong() - 1
    println(answer)
}
