package `everyDay-algoMethod`.sigmaAndPi

// 問題
// https://algo-method.com/tasks/579

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).map { it % 10 }
    var num = 1
    for (index in 0 until N) {
        num *= list[index]
        if (num >= 10) num %= 10
    }
    println(num)
}