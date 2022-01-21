package `full-search`.`dual-loop`

fun main() {
    val N = readLine()!!.toInt()
    var ansCount = 0
    for(index in 0 until N) {
        val S = readLine()!!.split("").filter { it.isNotEmpty() }
        val reversedS = S.reversed()
        if (S == reversedS) ansCount++
    }
    println(ansCount)
}