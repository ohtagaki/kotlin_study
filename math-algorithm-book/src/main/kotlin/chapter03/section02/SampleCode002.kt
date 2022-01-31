package chapter03.section02

import kotlin.math.min

// TLEになる、2数の最大公約数を求めるプログラム
fun main() {
    // 正の整数A、Bの最大公約数を返す関数
    val(A, B) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    var answer = 1L
    for (index in 2..min(A,B)) {
        if (A % index == 0L && B % index == 0L) answer = index
    }
    println(answer)
}
