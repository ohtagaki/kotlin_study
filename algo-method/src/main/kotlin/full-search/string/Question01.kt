package `full-search`.string

fun main() {
    val S = readLine()!!.toString()
    val c = readLine()!!.toString()
    // 文字列 S の中に 一文字c が含まれるかどうかを判定する
    println(if(S.contains(c)) "Yes" else "No")
}