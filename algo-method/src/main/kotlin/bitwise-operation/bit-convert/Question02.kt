package `bitwise-operation`.`bit-convert`

// 問題
// https://algo-method.com/tasks/167

fun main() {
    val num = 57
    // Int.toString(radix) を使用すると、数値 (Int) を任意の基数の文字列表現に変換することができる
    // 負の値を指定したときには結果が変わってくることに注意
    println(num.toString(2))
}
