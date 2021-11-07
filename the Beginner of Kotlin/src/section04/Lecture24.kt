package section04

fun main() {
    // Kotlinで可変長引数を表現するにはvarargキーワードを用いる
    // 可変長引数は内部的には配列とみなされるので、forループによる処理が可
    println(allSum(5,7,8,2))

    // スプレッド演算子（*）を使えば可変長引数に配列を渡すこともできる
    val arr = intArrayOf(1,4,5,7)
    // スプレッド演算子を使えば配列を可変長引数に渡せる
    println(allSum(*arr))
    // 配列をそのまま、println関数に直接渡すことはできない
    // 可変数引数の一部として、配列を渡すことも可能
    println(allSum(5, *arr, 4))

}

// Kotlinで可変長引数を表現するにはvarargキーワードを用いる
// 可変長引数は内部的には配列とみなされるので、forループによる処理が可
fun allSum(vararg values:Int): Int{
    var result = 0
    for (value in values){
        result += value
    }
    return result
}