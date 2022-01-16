package `everyDay-algoMethod`.set

// 問題
// https://algo-method.com/tasks/640

fun main() {
    val(N, X, Y) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println((1..N).toList().count { !(listA.contains(it) || listB.contains(it)) })
}