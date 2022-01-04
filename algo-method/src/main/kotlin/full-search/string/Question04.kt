package `full-search`.string

fun main() {
    val N = readLine()!!.toInt()
    // 入力された文字列を取得
    val S = readLine()!!.split("").filter { it.isNotEmpty() }
    val T = readLine()!!.split("").filter { it.isNotEmpty() }
    var ansCount = 0
    for (index in 0 until  N) {
        if (S[index] != T[index]) ansCount++
    }
    println(ansCount)
}