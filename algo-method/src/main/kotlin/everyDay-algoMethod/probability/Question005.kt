package `everyDay-algoMethod`.probability

// 問題
// https://algo-method.com/tasks/768

fun main() {
    // 入力
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val arrayP = IntArray(N + 1)
    arrayP[0] = 0
    for (index in 1..N) {
        arrayP[index] = list[index - 1]
    }
    val D = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)

    var answer: Double = 1.0
    // 各回の確率は独立している
    for (index in D.indices) {
        answer *= (arrayP[D[index]].toDouble() / 100.0)
    }
    // 出力
    println(answer)
}
