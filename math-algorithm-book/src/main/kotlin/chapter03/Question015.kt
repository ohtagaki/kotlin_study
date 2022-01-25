package chapter03

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_o

fun main() {
    // 正の整数A、Bの最大公約数を返す関数
    // ユークリッドの互除法
    var(A, B) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    var answer = 1L
    while (A >= 1 && B >= 1) {
        // AとBのうち、大きい方を書き換える
        // 片方が0になるまで、上記の操作を続ける
        if (A >= B) {
            A %= B
        } else {
            B %= A
        }
    }
    if (A >= 1) {
        println(A)
        return
    } else {
        println(B)
    }
}
