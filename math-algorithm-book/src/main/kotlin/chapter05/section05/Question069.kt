package chapter05.section05

import kotlin.math.max

fun main() {
    // 入力
    val (a, b, c, d) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // 最大値の候補は4パターン
    val answer = max(max(a * c, a * d), max(b * c, b * d))

    // 出力
    println(answer)
}
