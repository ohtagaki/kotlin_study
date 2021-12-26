package `receiving-input`.stdin

fun main() {
    val num = readLine()!!.toInt()
    val ans = num % 5
    println(ans)
}