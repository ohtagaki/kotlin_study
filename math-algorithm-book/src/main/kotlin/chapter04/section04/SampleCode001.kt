package chapter04.section04

//問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_k
// N以下の素数を全て出力するプログラム

import kotlin.math.sqrt

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    // 配列の初期化
    val primeNumberCheck = BooleanArray(N + 1){ true }
    val maxIndex = sqrt(N.toDouble()).toInt()

    // 素数かどうか確認(エラトステネスのふるい)
    for (index in 2 ..maxIndex) {
        if (primeNumberCheck[index]) {
            val maxValue = N / index
            for (checkNum in 2..maxValue) primeNumberCheck[index * checkNum] = false
        }
    }

    // N以下の素数を小さい順に出力
    val answerList = mutableListOf<Int>()
    for (index in 2..N) {
        if (primeNumberCheck[index]) answerList.add(index)
    }
    println(answerList.joinToString(" "))
}
