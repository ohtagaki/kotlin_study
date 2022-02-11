package `everyDay-algoMethod`.probability

import kotlin.math.pow

fun main() {
    // 入力
    val(N, M, P) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val p = P.toDouble() / 100.0

    // パターン数を求める(コンビネーション)
    // 表がM回出る時、裏はN - M 回出る
    var numerator = 1
    var denominator = 1
    for (index in 1..M) {
        numerator *= N - index + 1
        denominator *= index
    }
    val pattern = numerator / denominator

    // 答えを出力
    val answer = pattern.toDouble() * (p.pow(M) * (1 - p).pow(N - M))
    println(answer)
}
