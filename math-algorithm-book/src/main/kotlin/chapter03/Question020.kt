package chapter03

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_t

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var answer = 0
    for (index1 in 0 until N) {
        for (index2 in index1 + 1 until N) {
            for (index3 in index2 + 1 until N) {
                for (index4 in index3 + 1 until N) {
                    for (index5 in index4 + 1 until N) {
                        if (list[index1] + list[index2] + list[index3] + list[index4] + list[index5] == 1000) answer++
                    }
                }
            }
        }
    }
    println(answer)
}
