package chapter05.section06

fun main() {
    // 入力
    val (A, B) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)

    // 小問題に分割する
    // A以上B以下の整数の中に、tの倍数が2個以上存在するかどうか
    var answer = 1
    for (t in 1..B) {
        // A ÷ t　の小数点以下切り上げ
        val checkA = (A + t - 1) / t
        // B ÷ t　の小数点以下切り下げ
        val checkB = B / t
        if (checkB - checkA >= 1) answer = t
    }

    // 出力
    println(answer)

}
