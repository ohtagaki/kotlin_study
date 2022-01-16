package `everyDay-algoMethod`.set

// 書かれた数の個数 (2)
// https://algo-method.com/tasks/593

fun main() {
    val(N, X, Y) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println((1..N).toList().count { it % X == 0 && it % Y == 0 })
}