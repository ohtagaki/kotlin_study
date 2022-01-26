package chapter03.section02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_p

fun main() {
    val N = readLine()!!.toLong()
    val list = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    // N個の自然数の最大公約数の求め方
    // N個の自然数の最大公約数： リスト {a1,a2,a3,…,aN} の要素数が 1 つになるまで以下を繰り返す
    // 1.リストから2つ選んで最大公約数 gcd を計算し、リストに加える
    // 2.最後に残った1つが全体の最大公約数
    var answer = list[0]
    for (index in 1 until list.size) {
        answer = makeGreatestCommonDivisor(answer, list[index])
    }
    println(answer)
}

fun makeGreatestCommonDivisor(numA: Long, numB: Long): Long {
    // 正の整数A、Bの最大公約数を返す関数
    var A = numA
    var B = numB
    // ユークリッドの互除法
    while (A >= 1 && B >= 1) {
        // AとBのうち、大きい方を書き換える
        // 片方が0になるまで、上記の操作を続ける
        if (A >= B) {
            A %= B
        } else {
            B %= A
        }
    }
    return if (A >= 1) {
        A
    } else {
        B
    }
}
