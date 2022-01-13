package `everyDay-algoMethod`.set

// 数の合併 (A ∪ B)
// https://algo-method.com/tasks/590

fun main() {
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val answer = mutableListOf<Int>()
    listA.forEach { it -> answer.add(it) }
    listB.forEach { it -> if (!listA.contains(it)) answer.add(it) }
    answer.sorted().forEach { it -> println(it) }
}