package chapter03.section06

fun main() {
    // 入力
    val input = readLine()!!.toInt()

    // 再帰的関数を呼び出す
    val num = recursive(input)
    println(num)
}

fun recursive(num: Int) : Int {
    if(num == 1) return 1
    return recursive(num - 1) * num
}