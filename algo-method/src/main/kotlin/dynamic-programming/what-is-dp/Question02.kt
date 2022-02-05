package `dynamic-programming`.`what-is-dp`

import kotlin.math.min

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)

    // 動的計画法の準備
    val dp = IntArray(N + 1)
    dp[0] = 0
    dp[1] = list[1]

    // 動的計画法
    for (index in 2 until N) {
        // マス i−1 から Ai秒かけて移動する場合
        val patternA = dp[index - 1] + list[index]
        // マス i−2 から 2*Ai秒かけて移動する場合
        val patternB = dp[index - 2] + 2 * list[index]
        // 最小値を選択
        dp[index] = min(patternA, patternB)
    }

    // 出力
    val answer = dp[N - 1]
    println(answer)
}