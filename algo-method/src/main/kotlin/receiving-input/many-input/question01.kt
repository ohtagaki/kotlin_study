package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    // 数値N個の1行を受け取る
    val list = readLine()!!.split(" ").map { it.toInt() }
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sum.html
    // リストの合計値を得るには、sum()メソッドを利用する
    println(list.sum())
}