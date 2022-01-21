package `full-search`.number

fun main() {
    val N = readLine()!!.toInt()
    val list = (1.. N).toList()
    println(list.filter { N % it == 0}.size)
}