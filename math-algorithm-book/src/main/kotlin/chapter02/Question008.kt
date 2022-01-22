package chapter02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_h

fun main() {
    val (N, S) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var answer = 0
    for (indexA in 1 .. N) {
        for (indexB in 1 .. N) {
            if (indexA + indexB <= S) answer++
        }
    }
    println(answer)
}
