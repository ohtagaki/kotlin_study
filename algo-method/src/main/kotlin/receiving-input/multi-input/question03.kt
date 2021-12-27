package `receiving-input`.`multi-input`

fun main() {
    val list: List<Int> = readLine()!!.split(" ").map { it.toInt() }
    val A = list[0]
    val B = list[1]
    val remA = list[0] % 10
    val remB = list[1] % 10
    println(if(remA >= remB) B else A)
}