package chapter03.section03

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_u

fun main() {
    // Intだと、オーバーフロー発生する点に注意
    val(n, r) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    // 分子の算出
    var numerator = n
    for (index in 1 until r) {
        numerator *= (n - index)
    }
    // 分母の算出
    val denominator = factorial(r)
    val answer = numerator / denominator
    println(answer)
}

fun factorial(num: Long) :Long {
    return if (num != 1L) {
        num * factorial(num - 1)
    } else {
        1
    }
}
