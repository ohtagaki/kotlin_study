package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    for (index in 0 until N) {
        println(list[index] % 10)
    }
}