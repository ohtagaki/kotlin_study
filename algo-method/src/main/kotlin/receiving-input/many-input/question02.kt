package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    var ans = 1
    for (index in 0 until N) {
        ans *= list[index]
    }
    println(ans)
}