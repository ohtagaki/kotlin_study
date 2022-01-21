package `everyDay-algoMethod`.set

// 書かれた数の個数 (1)
// https://algo-method.com/tasks/592

fun main() {
    val(N , X) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val answer = N / X
    println(answer)
}