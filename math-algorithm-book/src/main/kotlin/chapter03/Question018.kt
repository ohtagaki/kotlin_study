package chapter03

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_r

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)

    // Intだと、オーバーフローを起こす点に注意
    val one = list.count { it == 100 }.toLong()
    val two = list.count { it == 200 }.toLong()
    val three = list.count { it == 300 }.toLong()
    val four = list.count { it == 400 }.toLong()

    val answer = one * four + two * three
    println(answer)
}
