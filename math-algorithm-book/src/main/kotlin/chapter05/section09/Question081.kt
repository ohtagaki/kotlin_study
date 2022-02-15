package chapter05.section09

fun main() {
    // 入力
    val N = readLine()!!.toInt()

    // 大きい額の札から払えるだけ払う
    val a = N / 10000
    val b = (N % 10000) / 5000
    val c = (N - a * 10000 - b * 5000) / 1000

    // 答えを出力
    val answer = a + b + c
    println(answer)
}
