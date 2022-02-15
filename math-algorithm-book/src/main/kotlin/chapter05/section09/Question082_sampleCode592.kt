package chapter05.section09

import kotlin.math.min

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val start = IntArray(N)
    val end = IntArray(N)
    for (i in 0 until N) {
        val (a, b) = readLine()!!.split(" ").let { Pair(it[0].toInt(), it[1].toInt()) }
        start[i] = a
        end[i] = b
    }

    // 映画の選び方のシミュレーション
    var currentTime = 0
    var answer = 0
    while (true) {
        // 見られる映画の終了時刻の最小値
        var minEndTime = 1000000
        for (index in 0 until N) {
            if (start[index] < currentTime) continue
            minEndTime = min(minEndTime, end[index])
        }
        if (minEndTime == 1000000) break
        currentTime = minEndTime
        answer += 1
    }

    // 出力
    println(answer)
}
