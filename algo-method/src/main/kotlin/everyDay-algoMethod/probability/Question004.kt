package `everyDay-algoMethod`.probability

// 問題
// https://algo-method.com/tasks/763

fun main() {
    val(N, X) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val arrayP = IntArray(N + 1)
    arrayP[0] = 0
    for (index in 1..N) {
        arrayP[index] = list[index - 1]
    }

    // 出目がXの倍数である確率を求める
    var numerator = 0 // 百分率表示
    for (index in 1..N) {
        // Xの倍数かどうかの判定
        if (index % X == 0) numerator += arrayP[index]
    }

    // 出力
    val answer = numerator.toDouble() / 100.0
    println(answer)
}
