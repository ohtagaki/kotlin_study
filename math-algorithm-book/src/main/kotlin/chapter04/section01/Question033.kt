package chapter04.section01

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_ae
import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    // 入力
    val(ax, ay) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    val(bx, by) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    val(cx, cy) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // ベクトルBA,BC,CA,CBの成分表示を求める
    val BAx = ax - bx
    val BAy = ay - by
    val BCx = cx - bx
    val BCy = cy - by
    val CAx = ax - cx
    val CAy = ay - cy
    val CBx = bx - cx
    val CBy = by - cy

    // どのパターンに当てはまるかを判定する
    // パターン1・3でなければ2
    var pattern = 2
    // 角ABCが90度より大きい
    if (BAx * BCx + BAy * BCy < 0L) pattern = 1
    // 角ACBが90度より大きい
    if (CAx * CBx + CAy * CBy < 0L) pattern = 3

    // 点と直線の距離を求める
    var answer = 0.0
    if (pattern == 1) answer = sqrt((BAx * BAx + BAy * BAy).toDouble())
    if (pattern == 3) answer = sqrt((CAx * CAx + CAy * CAy).toDouble())
    if (pattern == 2) {
        val S = abs(BAx * CAy - BAy * CAx)
        val BCLength = sqrt((BCx * BCx + BCy * BCy).toDouble())
        answer = S / BCLength
    }

    // 出力
    println("%.12f".format(answer))
}
