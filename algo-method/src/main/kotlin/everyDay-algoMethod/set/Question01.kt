package `everyDay-algoMethod`.set

// 共通する数
// https://algo-method.com/tasks/586

fun main() {
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val answer = listOf<Int>()
    listA.forEach { it -> if (listB.contains(it)) println(it) }
}