package chapter03.section07

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/dp_a

import kotlin.math.abs

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val dp = IntArray(N)

    // 動的計画法
    for (index in 0 until N) {
        if (index == 0) dp[index] = 0 // 同じ足場には移動不要
        // 隣の足場には直接ジャンプするしかなく、値どうしの差分の絶対値
        if (index == 1) dp[index] = abs(list[index - 1] - list[index])
        if (index >= 2) {
            // 1 個前の足場からジャンプするとき
            val checkA = dp[index - 1] + abs(list[index - 1] - list[index])
            // 2 個前の足場からジャンプするとき
            val checkB = dp[index - 2] + abs(list[index - 2] - list[index])
            dp[index] = checkA.coerceAtMost(checkB)
        }
    }
    println(dp[N - 1])
}
