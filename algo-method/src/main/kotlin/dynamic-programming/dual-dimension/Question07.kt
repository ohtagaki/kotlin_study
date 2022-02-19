package `dynamic-programming`.`dual-dimension`

import kotlin.math.min

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
    val dp = Array(N) {IntArray(N){10000000}}
    dp[0][N-1] = array[0][N-1]
    for (i in 0 until N) {
        for (j in N-1 downTo 0) {
            // 上から来る場合に大きい方を選択
            if (i >= 1) dp[i][j] = min(dp[i][j], dp[i-1][j] + array[i][j])

            // 右から来る場合に大きい方を選択
            if (j < N - 1) dp[i][j] = min(dp[i][j], dp[i][j+1] + array[i][j])
        }
    }

    // 出力
    println(dp[N-1][0])
}
