package chapter03.section01

import kotlin.math.sqrt
import kotlin.math.truncate

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_l
// 高速に素数判定を行うプログラム
fun main() {
    val N = readLine()!!.toLong()
    val primeCheck = isPrimeCheckQuickly(N)
    println(if (primeCheck) "Yes" else "No")
}

// numを2以上の整数として、numが素数であればtrue,素数でなければfalseを返す
fun isPrimeCheckQuickly(num: Long) :Boolean {
    // truncate(x)：小数点以下を切り捨て (xから0に最も近い整数)
    val root = truncate(sqrt(num.toDouble())).toLong()
    for (index in 2 .. root) {
        val zero: Long = 0
        // numがindexで割り切れた場合、numはこの時点で素数ではないと判明する
        if (num % index == zero) {
            return false
        }
    }
    return true
}
