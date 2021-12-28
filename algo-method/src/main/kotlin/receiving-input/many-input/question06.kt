package `receiving-input`.`many-input`

fun main() {
    val N = readLine()!!.toInt()
    // sum()：数値のコレクションの要素の合計の値を返します
    val sum = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).sum()
    println(sum / N)
}