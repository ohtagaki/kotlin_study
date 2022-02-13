package chapter05.section01

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_ax

import kotlin.math.abs

fun main() {
    // 入力
    val(N, X, Y) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // 最終的にN回でマスにたどり着くかどうかの条件
    // 1.|X| + |Y| <= N を満たす
    // 2. (|X| + |Y|) % 2 == N % 2

    // 絶対値を求める
    val conditionA: Boolean = abs(X) + abs(Y) <= N
    val conditionB: Boolean = (abs(X) + abs(Y)) % 2 == N % 2

    // 答えを出力
    println(if (conditionA && conditionB) "Yes" else "No")
}
