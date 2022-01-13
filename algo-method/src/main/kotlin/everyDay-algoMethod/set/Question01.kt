package `everyDay-algoMethod`.set

fun main() {
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val answer = listOf<Int>()
    listA.forEach { it -> if (listB.contains(it)) println(it) }
}