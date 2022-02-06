package `dynamic-programming`.`what-is-dp`

// 問題
// https://algo-method.com/tasks/306

import kotlin.math.min

fun main() {
    // 入力
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)

    // 動的計画法の準備
    val dp = IntArray(N + 2)
    dp[0] = 0
    dp[1] = list[1]

    // 動的計画法
    for (index in 2 until N) {
        dp[index] = Int.MAX_VALUE
        // マス i にたどりつくための M 通りの方法を試す
        for (m in M downTo 1) {
            // マス i-M が存在するかどうか判定
            if (index - m >= 0) {
                // マス i-M から M * A_i秒かけて移動する場合
                val check = dp[index - m] + m * list[index]
                // 最小値を選択
                dp[index] = min(dp[index], check)
            }
        }
    }

    // 出力
    val answer = dp[N - 1]
    println(answer)
}
