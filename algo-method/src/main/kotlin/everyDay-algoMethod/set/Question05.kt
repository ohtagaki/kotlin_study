package `everyDay-algoMethod`.set

// 問題
// https://algo-method.com/tasks/598

fun main() {
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    listA.forEach{ it -> if (!listB.contains(it)) println(it)}
}