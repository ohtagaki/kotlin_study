package chapter05.section05

import kotlin.math.abs
import kotlin.math.min

fun main() {
    // 入力
    val (N, K) = readLine()!!.split(" ").let { Pair(it[0].toInt(), it[1].toInt()) }
    val xy = Array(N) { readLine()!!.split(" ").let { Pair(it[0].toLong(), it[1].toLong()) } }
    var answer = 5000000000000000000L

    // 左端 x, 右端 x, 下端 y, 上端 yを全探索
    for (xLeft in xy.map { it.first }) {
        for (xRight in xy.map { it.first }) {
            for (yTop in xy.map { it.second }) {
                for (yBottom in xy.map { it.second }) {
                    // 点(Xi, yi)がK 個以上長方形に含まれているかどうか確認
                    if (xy.count { (x, y) -> x in xLeft..xRight && y in yTop..yBottom } >= K) {
                        val check = (abs((xRight - xLeft)) * abs((yTop - yBottom)))
                        answer = min(answer, check)
                    }
                }
            }
        }
    }

    // 答えを出力
    println(answer)
}
