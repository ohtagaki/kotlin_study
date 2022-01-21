package `full-search`.array

fun main() {
    val(N, V) = readLine()!!.split(" ").map { it.toInt() }
    val containOfV = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).contains(V)
    println(if(containOfV) "Yes" else "No")
}