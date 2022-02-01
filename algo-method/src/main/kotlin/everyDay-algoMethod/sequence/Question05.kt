package `everyDay-algoMethod`.sequence

// 問題
// https://algo-method.com/tasks/654

fun main() {
    val N = readLine()!!.toLong()
    // 1~Nまでの2乗の和
    val answer = N * (N + 1) * (2 * N  + 1) / 6
    println(answer)
}
