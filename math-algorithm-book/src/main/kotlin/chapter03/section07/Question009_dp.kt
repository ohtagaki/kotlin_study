package chapter03.section07

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_i

fun main() {
    val (N, S) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val maxValue = list.sum()
    val arrayA = IntArray(N + 1)
    // 所与された配列の初期化
    arrayA [0] = 0
    for (index in 1 .. N) {
        arrayA[index] = list[index - 1]
    }

    // 動的計画法で使用する配列の初期化
    val dp = Array(N + 1){ BooleanArray(maxValue + 1) }
    // 配列 dp が bool 型であることに注意してください
    dp[0][0] = true
    for (index in 1 .. N) {
        for (j in 0..maxValue) {
            if (dp[index - 1][j]) {
                // カード i （listのi番目の要素）を選ばなかった場合
                dp[index][j] = true
                // カード i （listのi番目の要素）を選んだ場合
                dp[index][j + arrayA[index]] = true
            }
        }
    }
    // 出力
    var checkFlg = false
    for (index in 0 .. N) {
        if (dp[index][S]) checkFlg = true
    }
    if (checkFlg){
        println("Yes")
    } else {
        println("No")
    }
}
