package `receiving-input`.`multi-input`

fun main() {
    val list: List<Int> = readLine()!!.split(" ").map { it.toInt() }
    val A = list[0]
    val B = list[1]
    println(A + B)
}