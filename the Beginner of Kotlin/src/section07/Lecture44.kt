package section07

// ジェネリック関数
// 引数と戻り値の型を関数の呼び出し時に決めることのできる関数

// ジェネリック関数の定義は関数名の前に型引数を記述することで可能
// 呼び出しは関数名のあとに型を指定するか、型推論が可能なら普通に呼び出せる

// ジェネリック関数は関数を定義できる場所ならばどこでも定義できることに注意
// ジェネリック型のクラス内部などに限定されていない

fun <T> tail(array: Array<T>): T = array[array.size - 1]

fun main() {
    val array1 = arrayOf(2,4,6)
    val array2 = arrayOf("あ", "か", "さ")
    println(tail<Int>(array1))
    println(tail(array1))
    println(tail<String>(array2))
}