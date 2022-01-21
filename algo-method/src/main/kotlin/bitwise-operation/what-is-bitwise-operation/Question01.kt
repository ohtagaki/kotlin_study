package `bitwise-operation`.`what-is-bitwise-operation`

// 問題
// https://algo-method.com/tasks/129

fun main() {
    val S = 0b00110
    val BIT_FLAG_1 = (1 shl 1)
    // and：論理積
    println(if (S and BIT_FLAG_1 == 0b00010) "Yes" else "No")
}