package chapter03.section07

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_ab

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val dp = IntArray(N + 1)

    // 動的計画法
    for (index in 0..N) {
        if (index == 0) dp[index] = 1 // 同じ段数にはい続けるだけの1通り
        // 1つ上の段数の足場には直接行くしかない
        // 2つ上の段数の足場には1段ずつ上るかor2段ずつ上るかの2通り
        if (index == 1) dp[index] = 1
        if (index == 2) dp[index] = 2
        if (index >= 3) {
            // 1段前の段数から1段上るパターン
            val checkA = dp[index - 1]
            // 2段前の段数から1段上るパターン
            val checkB = dp[index - 2]
            dp[index] = checkA + checkB
        }
    }
    println(dp[N])
}
