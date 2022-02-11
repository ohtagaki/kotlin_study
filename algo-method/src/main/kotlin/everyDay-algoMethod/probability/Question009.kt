package `everyDay-algoMethod`.probability

import kotlin.math.pow

fun main() {
    // 入力
    val N = readLine()!!.toInt()

    // １回の試行で、異なる確率
    val other = 1.0 - 1.0 / N

    // 答えを出力
    val answer = 1 - other.pow(N)
    println(answer)
}
