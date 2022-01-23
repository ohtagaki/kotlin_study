package chapter03

import kotlin.math.sqrt
import kotlin.math.truncate

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_m

fun main() {
    val N = readLine()!!.toLong()
    val list = mutableListOf<Long>()
    // truncate(x)：小数点以下を切り捨て (xから0に最も近い整数)
    val root = truncate(sqrt(N.toDouble())).toLong()
    for (index in 1 .. root) {
        val zero: Long = 0
        // numがindexで割り切れなかった場合、indexはこの時点で約数ではないと判明する
        if (N % index != zero) continue
        // numがindexで割り切れた場合、indexはこの時点で約数と判明する
        list.add(index)
        if (index != N / index) {
            // index != N / indexの時、N / indexもこの時点で約数と判明する
            list.add((N / index))
        }
    }
    list.sorted().forEach { println(it) }
}
