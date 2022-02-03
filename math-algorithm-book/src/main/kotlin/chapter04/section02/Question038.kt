package chapter04.section02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_ai

fun main() {
    // 入力
    val (N, Q) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).toIntArray()
    // 配列の初期化
    val arrayL = IntArray(Q + 1)
    val arrayR = IntArray(Q + 1)
    arrayL[0] = 0
    arrayR[0] = 0
    for (index in 1 .. Q) {
        val (l, r) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
        arrayL[index] = l
        arrayR[index] = r
    }

    // 累積和を求める
    val arrayB = IntArray(N + 1)
    for (index in 1..N) {
        arrayB[index] = arrayB[index - 1] + list[index - 1]
    }

    // 出力
    for (index in 1..Q) {
        val answer = arrayB[arrayR[index]] - arrayB[arrayL[index] - 1]
        println(answer)
    }
}
