package chapter03.section07

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/dp_d

// ナップザック問題
fun main() {
    // 入力
    val (N, W) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val arrayW = IntArray(N + 1 )
    val arrayV = IntArray(N + 1)
    // 所与された配列の初期化
    arrayW[0] = 0
    arrayV[0] = 0
    for (index in 1 .. N) {
        val (a, b) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
        arrayW[index] = a
        arrayV[index] = b
    }
    // 動的計画法で使用する配列の初期化
    val dp = Array(N + 1){ LongArray(W + 1) }
    dp[0][0] = 0

    // 動的計画法
    // 考え方
    // 方法A：品物i - 1までの重さの総和がjであり、品物iを選ばない
    // 方法B：品物i - 1までの重さの総和がj -Wiであり、品物iをぶ場合
    for (index in 1 .. N) {
        for (j in 0 .. W) {
            if (j < arrayW[index]) {
                // j < w[i] のとき、方法 A だけしか選べない
                dp[index][j] = dp[index - 1][j]
            } else {
                // j >= w[i] のとき、方法 A・方法 B どちらも選べる
                dp[index][j]  = dp[index - 1][j].coerceAtLeast(dp[index - 1][j - arrayW[index]] + arrayV[index])
            }
        }
    }

    // 出力
    var answer = 0L
    for (index in 0 .. W) {
        answer = answer.coerceAtLeast(dp[N][index])
    }
    println(answer)
}
