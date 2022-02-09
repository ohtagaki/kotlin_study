package `everyDay-algoMethod`.probability

// 問題
// https://algo-method.com/tasks/765

import kotlin.math.pow

fun main() {
    // 入力
    val N = readLine()!!.toInt()

    // 自分と他人Aが誕生日が異なる確率
    val other = 1.0 - 1.0 / 365.0

    // 答えを出力
    val answer = 1 - other.pow(N)
    println(answer)
}
