package chapter02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_k
// 素数判定

fun main() {
    val N = readLine()!!.toInt()
    var answer = mutableListOf<Int>()
    for (check in 2 ..N) {
        label@for (index in 2 ..check) {
            if (check % index == 0 && check == index) {
                answer.add(check)
                break@label
            } else if (check % index == 0){
                break@label
            }
        }
    }
    answer.forEach { print("$it ") }
    println()
}
