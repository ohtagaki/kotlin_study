package `everyDay-algoMethod`.probability

// 問題
// https://algo-method.com/tasks/762

fun main() {
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val answer :Double = M.toDouble() / N.toDouble()
    println(answer)
}
