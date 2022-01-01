package `full-search`.array

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    // minOrNull()とmaxOrNull()：要素の最小値を返す
    // 空のコレクションに対してはnullを返す
    println(list.minOrNull())
}