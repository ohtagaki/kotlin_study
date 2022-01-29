package chapter03.section07

import kotlin.math.max

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    val array = LongArray(N + 1)
    // 所与された配列の初期化
    array [0] = 0
    for (index in 1 .. N) {
        array[index] = list[index - 1]
    }
    // 動的計画法で使用する配列の初期化
    // 用意する配列（二次元配列）
    // dp1 i ： i 日目に勉強する場合の、これまでの実力アップの最大値
    // dp2 i ： i 日目に勉強しない場合の、これまでの実力アップの最大値
    val dp1 = LongArray(N + 1)
    val dp2 = LongArray(N + 1)
    dp1[0] = 0L
    dp2[0] = 0L

    // 動的計画法
    for(index in 1..N) {
        dp1[index] = dp2[index - 1] + array[index]
        dp2[index] = max(dp1[index - 1], dp2[index - 1])
    }

    // 出力
    println(max(dp1[N], dp2[N]))
}
