package `dynamic-programming`.`dual-dimension`

import kotlin.math.max

fun main() {
    // 入力
    val N = readLine()!!.trim().toInt()

    // 動的計画法の準備
    val array = Array(N) {IntArray(N)}
    for (i in 0 until N) {
        val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
        for (j in 0 until N) {
            array[i][j] = list[j]
        }
    }

    // 動的計画法
    val dp = Array(N) {IntArray(N)}
    dp[0][0] = array[0][0]
    for (index in 1 until N) {
        // 端の行と列を計算
        dp[index][0] += (array[index][0] + dp[index-1][0])
        dp[0][index] += (array[0][index] + dp[0][index-1])
    }
    for (i in 1 until N) {
        for (j in 1 until N) {
            // 上から来る場合と左から来る場合で大きい方を選択
            dp[i][j] = array[i][j] + max(dp[i-1][j], dp[i][j-1])
        }
    }

    // 出力
    println(dp[N-1][N-1])
}
