package `everyDay-algoMethod`.sequence

// 問題
// https://algo-method.com/tasks/649

fun main() {
    val(N, X) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    (0..N).toList().forEach { println(it * 500 + X) }
}
