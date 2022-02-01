package `everyDay-algoMethod`.sequence

import kotlin.math.pow

// 問題
// https://algo-method.com/tasks/651

fun main() {
    val radix = 2.0
    for (index in 0..20) {
        println(radix.pow(index).toInt())
    }
}
