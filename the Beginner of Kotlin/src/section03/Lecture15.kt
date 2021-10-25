package section03

fun main() {
    // 演算子
    // 四則演算や比較などの、値の計算処理を行うための記号

    // 比較演算子：null許容型のところで登場した「==」と「===」など
    // 範囲演算子：「m..n」というように書くと、m~nの範囲を表現することができる

    val num = 10
    println(num in 1..20)
    val startNum = 1
    println(startNum in 1..20)
    val endNum = 20
    println(endNum in 1..20)
}