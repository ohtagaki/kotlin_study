package chapter02

// ビット演算
fun main() {
    val(a, b) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    // and演算
    println(a and b)
    // OR演算
    println(a or b)
    // XOR演算
    println(a xor b)
}