package `everyDay-algoMethod`.probability

fun main() {
    val N = readLine()!!.toInt()

    // １回の試行で、外れくじを引く確率
    val play = 1.0 - 1.0 / N.toDouble()

    // 答えを出力
    val answer = 1 - play * play

    println(answer)
}
