package `bitwise-operation`.`what-is-bitwise-operation`

// 問題
// https://algo-method.com/tasks/131

fun main() {
    val S = 0b01001
    var count = 0
    for (index in 0..4) {
        val BIT_FLAG = (1 shl index)
        // and：論理積
        if (S and BIT_FLAG == BIT_FLAG) count++
    }
    println(count)
}