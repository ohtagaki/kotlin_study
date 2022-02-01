package `everyDay-algoMethod`.sequence

// 問題
// https://algo-method.com/tasks/656

fun main() {
    var(N, X, r) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    var answer = X
    val max = 1000000000L
    for (index in 0 until N - 1) {
        X = (X * r) % max
        answer += X % max
    }
    println(answer * (r - 1) % max)
}
