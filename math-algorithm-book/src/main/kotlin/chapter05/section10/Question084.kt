package chapter05.section10

fun main() {
    // 入力
    val(a, b, c) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // 整数で処理する
    val check = c - a - b
    val answer = 4 * a * b < check * check && check > 0L

    // 出力
    println(if (answer) "Yes" else "No")
}
