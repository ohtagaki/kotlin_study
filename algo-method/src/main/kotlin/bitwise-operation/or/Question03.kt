package `bitwise-operation`.or

// 問題
// https://algo-method.com/tasks/175

fun main() {
    val six = 6.toString(2).toInt(2)
    val fourteen = 14.toString(2).toInt(2)
    println((six or fourteen).toInt())
}
