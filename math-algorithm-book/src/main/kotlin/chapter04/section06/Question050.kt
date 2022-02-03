package chapter04.section06

fun main() {
    // 入力
    var(a, b) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // 繰り返し2乗法による処理
    var answer = 1L
    for (index in 0 until 30) {
        // 整数bを2進法表記したとき2のi乗の位が1となるかどうか
        if ((b and (1 shl index).toLong()) != 0L) {
            answer = (answer * a) % 1000000007
        }
        a = (a * a) % 1000000007
    }

    // 出力
    println(answer)
}

// 通常の繰り返しだとTLEになる
// fun main() {
//    // 入力
//    val(a, b) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
//
//    // 処理
//    var answer = 1L
//    for (index in 1 .. b) {
//        answer *= a
//        answer %= 1000000007
//    }
//
//    // 出力
//    println(answer)
//}