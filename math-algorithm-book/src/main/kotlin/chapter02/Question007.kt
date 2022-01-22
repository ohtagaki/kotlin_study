package chapter02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_g

fun main() {
    val (N, X, Y) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val answer = (1..N).toList().count { it % X == 0 || it % Y == 0 }
    println(answer)

    // 別解
    var anotherCount = 0
    for (index in 1 .. N) {
        if (index % X == 0 || index % Y == 0) anotherCount++
    }
    println(anotherCount)
}
