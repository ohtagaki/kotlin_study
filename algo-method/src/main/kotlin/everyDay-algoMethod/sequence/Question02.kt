package `everyDay-algoMethod`.sequence

// 問題
// https://algo-method.com/tasks/650

fun main() {
    val(A, B, X, Y) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val diffByOne = (Y - X) / (B - A)
    val answer = X - A * diffByOne
    println(answer)
}
