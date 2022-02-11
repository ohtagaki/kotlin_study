package `everyDay-algoMethod`.probability

// 問題
// https://algo-method.com/tasks/760

fun main() {
    val X = readLine()!!.toInt()
    var pattern = 0
    // 2つのサイコロの出目の和がXになる通りを全探索で求める
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == X) pattern++
        }
    }
    // 確率計算
    val answer : Double = pattern.toDouble() / 36.0
    println(answer)
}
