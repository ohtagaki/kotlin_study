package chapter05.section04

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_bd

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun main() {
    // 入力
    val (N, K) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // 余事象を考える
    var remove = 0L
    for (a in 1..N) {
        for (b in max(1, a - (K - 1))..min(N, a + (K - 1))){
            for (c in max(1, a - (K - 1))..min(N, a + (K - 1))){
                if (abs(b - c) <= K - 1) remove++
            }
        }
    }

    // 答えを出力
    val answer = N * N * N - remove
    println(answer)
}
