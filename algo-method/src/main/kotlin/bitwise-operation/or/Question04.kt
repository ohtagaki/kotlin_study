package `bitwise-operation`.or

// 問題
// https://algo-method.com/tasks/176

fun main() {
    val(A, B) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val a = A.toString(2).toInt(2)
    val b = B.toString(2).toInt(2)
    println((a or b).toInt())
}
