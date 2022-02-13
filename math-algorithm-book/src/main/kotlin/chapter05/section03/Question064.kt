package chapter05.section03

//　問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_bc

fun main() {
    // 入力
    val (N, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)

    // 数列の要素を全てゼロにするための条件
    // 1.数列の要素の全ての和が試行回数K以下
    val checkA: Boolean = list.sum() <= K
    // 2.操作回数Kと数列の要素の総和の偶奇が一致
    val checkB: Boolean = list.sum() % 2 == K % 2

    // 答えを出力
    println(if (checkA && checkB) "Yes" else "No")
}
