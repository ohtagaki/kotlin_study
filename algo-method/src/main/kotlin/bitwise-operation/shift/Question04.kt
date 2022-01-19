package `bitwise-operation`.shift

fun main() {
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(N.shr(M))
}