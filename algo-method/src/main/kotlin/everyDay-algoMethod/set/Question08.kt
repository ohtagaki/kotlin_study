package `everyDay-algoMethod`.set

// 問題
// https://algo-method.com/tasks/641

fun main() {
    val N = readLine()!!.toInt()
    // 全探索
    // println((1..N).toList().count { it % 3 != 0 && it % 5 != 0 })
    val three = N / 3
    val five = N / 5
    val common = N / 15
    println(N - (three + five - common))
}