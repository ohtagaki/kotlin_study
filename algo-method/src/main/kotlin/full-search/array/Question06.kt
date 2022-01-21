package `full-search`.array

fun main() {
    val N = readLine()!!.toInt()
    // maxOrNull()：要素の最大値を返します
    val maxNum = readLine()!!.split(" ").mapNotNull(String::toIntOrNull).maxOrNull()!!
    println(maxNum)
}