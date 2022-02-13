package chapter05.section04

fun main() {
    // 入力
    val (H, W) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val array = Array(H) {IntArray(W)}
    val sumArrayRows = IntArray(H)
    val sumArrayColumns = IntArray(W)
    val list = (0 until H).map{readLine()!!.split(" ").map{it.toInt()}}
    for (h in 0 until H) {
        for (w in 0 until W) {
            array[h][w] = list[h][w]
        }
        // 各行の総和をまとめる
        sumArrayRows[h] = list[h].sum()
    }

    // 各列の総和をまとめる
    for (index in 0 until W) {
        var columns = 0
        for (h in 0 until H) {
            val value = list[h][index]
            columns += value
        }
        sumArrayColumns[index] = columns
    }

    // 答えを出力
    val answer = Array(H) {IntArray(W)}
    for (h in 0 until H) {
        for (w in 0 until W) {
            answer[h][w] = sumArrayRows[h] + sumArrayColumns[w] - array[h][w]
        }
    }

    answer.forEach { println(it.joinToString(" ")) }
}
