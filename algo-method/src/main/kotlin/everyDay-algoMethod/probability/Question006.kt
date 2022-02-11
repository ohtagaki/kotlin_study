package `everyDay-algoMethod`.probability

// 問題
// https://algo-method.com/tasks/761

fun main() {
    // 入力
    val(N, X) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val arrayP = IntArray(N + 1)
    arrayP[0] = 0
    for (index in 1..N) {
        arrayP[index] = list[index - 1]
    }

    // 2回の出目の和が、Xになっているかどうかチェック
    var answer = 0.0
    for (indexOne in 1..N) {
        for (indexTwo in 1..N) {
            if (indexOne + indexTwo == X) {
                val a = arrayP[indexOne].toDouble() / 100.0
                val b = arrayP[indexTwo].toDouble() / 100.0
                answer += a * b
            }
        }
    }

    // 出力
    println(answer)
}
