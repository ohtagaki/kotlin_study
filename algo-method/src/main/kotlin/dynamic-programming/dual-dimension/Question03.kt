package `dynamic-programming`.`dual-dimension`

import kotlin.math.max

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val list = (0 until N).map{readLine()!!.trim().split(" ").map{it.toInt()}}

    // 動的計画法の準備
    val array = Array(N) {IntArray(3)}
    for (index in 0 until N) {
        val(a, b, c) = list[index]
        array[index][0] = a
        array[index][1] = b
        array[index][2] = c
    }

    // 動的計画法
    val dp = Array(N) {IntArray(3)}
    dp[0][0] = array[0][0]
    dp[0][1] = array[0][1]
    dp[0][2] = array[0][2]

    for (index in 1 until N) {
        dp[index][0] = max(dp[index - 1][1], dp[index - 1][2]) + array[index][0]
        dp[index][1] = max(dp[index - 1][0], dp[index - 1][2]) + array[index][1]
        dp[index][2] = max(dp[index - 1][0], dp[index - 1][1]) + array[index][2]
    }

    var answer = max(max(dp[N - 1][0],dp[N - 1][2]), max(dp[N - 1][1],dp[N - 1][2]))

    // 出力
    println(answer)
}
