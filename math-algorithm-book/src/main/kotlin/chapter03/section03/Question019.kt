package chapter03.section03

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_s

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)

    // 各色の枚数を抽出する
    val red = list.count{ it == 1 }.toLong()
    val yellow = list.count{ it == 2 }.toLong()
    val blue = list.count{ it == 3 }.toLong()

    val answer = red * (red - 1) / 2 + yellow * (yellow - 1) / 2 + blue * (blue - 1) / 2
    println(answer)
}
