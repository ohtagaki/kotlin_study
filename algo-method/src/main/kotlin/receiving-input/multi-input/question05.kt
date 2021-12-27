package `receiving-input`.`multi-input`

fun main() {
    val list: List<Int> = readLine()!!.split(" ").map { it.toInt() }
    val sum = list[0] + list[1] + list[2]
    println(sum / 3)
}