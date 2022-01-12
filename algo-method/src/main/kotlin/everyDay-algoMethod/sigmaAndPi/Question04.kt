package `everyDay-algoMethod`.sigmaAndPi

// 問題
// https://algo-method.com/tasks/569

fun main() {
    val N = readLine()!!.toInt()
    var count = 0
    for (i in 1 until N) {
        for (j in i + 1 .. N) {
            count += i * j
        }
    }
    println(count)
}