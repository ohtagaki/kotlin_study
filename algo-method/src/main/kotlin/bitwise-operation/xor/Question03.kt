package `bitwise-operation`.xor

// 問題
// https://algo-method.com/tasks/180

fun main() {
    val six = 6.toString(2).toInt(2)
    val eleven = 11.toString(2).toInt(2)
    println((six xor eleven).toInt())
}
