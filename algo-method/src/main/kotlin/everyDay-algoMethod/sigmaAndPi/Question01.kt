package `everyDay-algoMethod`.sigmaAndPi

// 問題
// https://algo-method.com/tasks/566

fun main() {
    val N = readLine()!!.toInt()
    var count = 0
    for (index in 1 ..N) {
        count += index
    }
    println(count)
}