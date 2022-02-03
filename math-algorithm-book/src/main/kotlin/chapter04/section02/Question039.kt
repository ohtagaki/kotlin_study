package chapter04.section02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_aj

fun main() {
    // 入力
    val (N, Q) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    // 配列の初期化
    val arrayL = IntArray(Q + 1)
    val arrayR = IntArray(Q + 1)
    val arrayX = IntArray(Q + 1)
    arrayL[0] = 0
    arrayR[0] = 0
    arrayX[0] = 0
    // 階差を格納する配列の初期化
    val arrayB = IntArray(N + 2)
    for (index in 1 .. Q) {
        // 入力値の代入
        val (l, r, x) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
        arrayL[index] = l
        arrayR[index] = r
        arrayX[index] = x

        // 区間の始まりと終わりに注目して、増減を整理する
        arrayB[arrayL[index]] += arrayX[index]
        arrayB[arrayR[index] + 1] -= arrayX[index]
    }

    var answer = StringBuilder()
    // 出力
    for (index in 2..N) {
        if (arrayB[index] > 0) answer.append("<")
        if (arrayB[index] == 0) answer.append("=")
        if (arrayB[index] < 0) answer.append(">")
    }
    println(answer.toString())
}
