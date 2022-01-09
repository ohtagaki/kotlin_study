package `full-search`.pair

fun main() {
    val N = readLine()!!.toInt()
    val S = readLine()!!.split("").filter { it.isNotEmpty() }
    var ansCount = 0
    for(index in 0 until N) {
        for (nextIndex in index+1 until N) {
            if (S[index] == S[nextIndex]) ansCount++
        }
    }
    println(ansCount)
}