package `bitwise-operation`.and

fun main() {
    val (A, B) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val a = A.toString(2).toInt(2)
    val b = B.toString(2).toInt(2)
    println((a and b).toInt())
}